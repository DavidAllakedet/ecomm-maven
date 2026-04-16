package com.groupeisi.company.controllers;

import com.groupeisi.company.dto.ProduitsDTO;
import com.groupeisi.company.service.ProduitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("produit", produitsService.getProduitById(id));
        return "produits/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute ProduitsDTO dto) {
        produitsService.saveProduit(dto);
        return "redirect:/produits";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute ProduitsDTO dto) {
        produitsService.updateProduit(dto, dto.getId());
        return "redirect:/produits";
    }
}
