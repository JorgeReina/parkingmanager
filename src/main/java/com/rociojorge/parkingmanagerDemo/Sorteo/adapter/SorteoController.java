package com.rociojorge.parkingmanagerDemo.Sorteo.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rociojorge.parkingmanagerDemo.Sorteo.domain.SorteoRepository;

@Controller
public class SorteoController {
    

    private SorteoRepository repository = new SorteoRepository();
        
    @GetMapping("/sorteo")
    public String displaySorteo(Model model) {
        model.addAttribute("sorteo", repository.getAll());
        return "sorteo";
    }
}
