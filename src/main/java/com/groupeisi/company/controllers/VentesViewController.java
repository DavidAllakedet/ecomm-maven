package com.groupeisi.company.controllers;

import com.groupeisi.company.service.VentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventes")
public class VentesViewController {

    @Autowired
    private VentesService ventesService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("ventes", ventesService.getAllVentes());
        return "ventes/list";
    }
}
