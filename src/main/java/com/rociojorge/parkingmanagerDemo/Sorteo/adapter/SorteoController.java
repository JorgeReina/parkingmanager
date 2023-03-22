package com.rociojorge.parkingmanagerDemo.sorteo.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rociojorge.parkingmanagerDemo.sorteo.domain.SorteoDao;
import com.rociojorge.parkingmanagerDemo.sorteo.service.SorteoService;

@Controller
public class SorteoController {
    
    private SorteoService sorteoService;

    public SorteoController(SorteoService sorteoService){
        this.sorteoService = sorteoService;
    }

    @GetMapping("/sorteo")
    public String displayUsers(Model model) {
        model.addAttribute("sorteo", sorteoService.getAll());
        return "sorteo";
    }

    @GetMapping("/newSorteo")
    public String showSorteoCreateForm(Model model) {
        SorteoDao sorteoDao = new SorteoDao();
        model.addAttribute("newsorteo", sorteoDao);
        return "newsorteoform";
    }

    @PostMapping("/newSorteo")
    public String createSorteo(@ModelAttribute SorteoDao sorteoDao) {
        this.sorteoService.register(sorteoDao);
        return "redirect:/sorteo";
    }
}
