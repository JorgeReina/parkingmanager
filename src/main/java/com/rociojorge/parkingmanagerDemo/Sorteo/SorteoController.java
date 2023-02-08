package com.rociojorge.parkingmanagerDemo.Sorteo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SorteoController {
    

    private SorteoRepository repository = new SorteoRepository();
        
    @GetMapping("/sorteo")
    public String displaySorteo(Model model) {
        model.addAttribute("sorteo", repository.getAll());
        return "sorteo";
    }
}
