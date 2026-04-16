package com.groupeisi.company.controllers;

import com.groupeisi.company.service.AchatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
