package com.rociojorge.parkingmanagerDemo.user.adapter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rociojorge.parkingmanagerDemo.core.exceptions.UserExistsException;
import com.rociojorge.parkingmanagerDemo.user.domain.Rol;
import com.rociojorge.parkingmanagerDemo.user.domain.UserDao;
import com.rociojorge.parkingmanagerDemo.user.service.UserService;

import jakarta.validation.Valid;

/**
 * Controlador de la clase usuario.
 * @author Jorge Reina Romero
 * @author Rocio Gonfaus Luengo
 * @since 12.04.2022
 * @version v0.1
 */

@Controller
public class UserController {
    
    private UserService userService;

    /**
     * Constructor con datos
     * @param userService 
     */
    public UserController(UserService userService){
        this.userService = userService;
    }

    /**
     * Acceso a la lista de usuarios
     * @param model
     * @return devuelve la lista  de usuarios
     */
    @GetMapping("/userlist")
    public String displayUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "user/userlist";
    }

    /**
     * Acceso de formulario de creacion de usaurios
     * @param model
     * @return devuelve el formulario de creacion de usaurios
     */
    @GetMapping("/newUser")
    public String showUserCreateForm(Model model) {
        UserDao userDao = new UserDao();
        model.addAttribute("userDao", userDao);
        addRoleSelectList(model);
        return "user/newuserform";
    }

    private void addRoleSelectList(Model model) {
        List<Rol> roles = Arrays.asList(Rol.values());
        model.addAttribute("roles", roles);
    }

    /**
     * Registra el usuario en la base de datos
     * @param userDao
     * @return Lista de usuarios
     */
    @PostMapping("/newUser")
    public String createUser(@Valid @ModelAttribute UserDao userDao, BindingResult bindingResult, Model model) {
        // Si algun error de validación automática con UserDao
        if (bindingResult.hasErrors()) {
            model.addAttribute("userDao", userDao);
            addRoleSelectList(model);
            return "user/newuserform";
        }

        try {
            this.userService.register(userDao);
        }
        // Cuando ya existe un usuario con el correo
        catch (UserExistsException exception) {
            model.addAttribute("userDao", userDao);
            addRoleSelectList(model);
            bindingResult.reject("email", "Ya existe el usuario con el correo");
            return "user/newuserform";
        }
        return "redirect:/userlist";
    }
}
