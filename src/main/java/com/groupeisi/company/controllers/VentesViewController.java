package com.groupeisi.company.controllers;

import com.groupeisi.company.dto.VentesDTO;
import com.groupeisi.company.service.VentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/form")
    public String form() {
        return "ventes/form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("vente", ventesService.getVenteById(id));
        return "ventes/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute VentesDTO dto) {
        ventesService.saveVentes(dto);
        return "redirect:/ventes";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute VentesDTO dto) {
        ventesService.updateVentes(dto, dto.getId());
        return "redirect:/ventes";
    }
}
