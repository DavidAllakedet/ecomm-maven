package com.groupeisi.company.controllers;

import com.groupeisi.company.service.ProduitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produits")
public class ProduitsViewController {

    @Autowired
    private ProduitsService produitsService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("produits", produitsService.getAllProduits());
        return "produits/list";
    }

    @GetMapping("/form")
    public String form() {
        return "produits/form";
    }
}
