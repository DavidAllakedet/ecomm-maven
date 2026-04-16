package com.groupeisi.company.controllers;

import com.groupeisi.company.dto.UsersDTO;
import com.groupeisi.company.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UsersViewController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "users/list";
    }

    @GetMapping("/form")
    public String form() {
        return "users/form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("user", usersService.getUserById(id));
        return "users/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute UsersDTO dto) {
        usersService.saveUser(dto);
        return "redirect:/users";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute UsersDTO dto) {
        usersService.updateUser(dto, dto.getId());
        return "redirect:/users";
    }
}
