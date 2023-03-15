package com.rociojorge.parkingmanagerDemo.user.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rociojorge.parkingmanagerDemo.user.domain.UserDao;
import com.rociojorge.parkingmanagerDemo.user.service.UserService;

@Controller
public class UserController {
    
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/userlist")
    public String displayUsers(Model model) {
        model.addAttribute("users", userService.getAll());
        return "user/userlist";
    }

    @GetMapping("/newUser")
    public String showUserCreateForm(Model model) {
        UserDao userDao = new UserDao();
        model.addAttribute("newuser", userDao);
        return "user/newuserform";
    }

    @PostMapping("/newUser")
    public String createUser(@ModelAttribute UserDao userDao) {
        this.userService.register(userDao);
        return "redirect:/userlist";
    }
}
