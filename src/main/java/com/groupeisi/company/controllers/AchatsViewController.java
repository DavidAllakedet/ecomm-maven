package com.groupeisi.company.controllers;

import com.groupeisi.company.dto.AchatsDTO;
import com.groupeisi.company.service.AchatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/achats")
public class AchatsViewController {

    @Autowired
    private AchatsService achatsService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("achats", achatsService.getAllAchats());
        return "achats/list";
    }

    @GetMapping("/form")
    public String form() {
        return "achats/form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("achat", achatsService.getAchatById(id));
        return "achats/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute AchatsDTO dto) {
        achatsService.saveAchats(dto);
        return "redirect:/achats";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute AchatsDTO dto) {
        achatsService.updateAchats(dto, dto.getId());
        return "redirect:/achats";
    }
}
