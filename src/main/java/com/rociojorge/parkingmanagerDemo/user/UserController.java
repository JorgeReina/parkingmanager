package com.rociojorge.parkingmanagerDemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    
    @Autowired
    private UserRepository repository;
        
    @GetMapping("/userlist")
    public String displayUsers(Model model) {
        model.addAttribute("users", repository.findAll());
        return "userlist";
    }

    @GetMapping("/newUser")
    public String showUserCreateForm(Model model) {
        UserDao userDao = new UserDao();
        model.addAttribute("newuser", userDao);
        return "newuserform";
    }

    @PostMapping("/createUser")
    public String createUser(@ModelAttribute UserDao userDao) {
        return "redirect:/userlist";
    }
}
