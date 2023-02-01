package com.rociojorge.parkingmanagerDemo.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    
    private UserRepository repository = new UserRepository();
        
    @GetMapping("/userlist")
    public String displayUsers(Model model) {
        model.addAttribute("users", repository.getAll());
        return "userlist";
    }
}
