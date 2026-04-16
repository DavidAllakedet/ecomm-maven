package com.groupeisi.company.controllers;

import com.groupeisi.company.dto.ProduitsDTO;
import com.groupeisi.company.service.ProduitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class ProductsController {

    @Autowired
    private ProduitsService produitsService;

    @GetMapping("/all")
    public List<ProduitsDTO> getAll() {
        return produitsService.getAllProduits();
    }

    @PostMapping("/create")
    public ProduitsDTO create(@RequestBody ProduitsDTO dto) {
        return produitsService.saveProduit(dto);
    }

    @PutMapping("/update/{id}")
    public ProduitsDTO update(@PathVariable Long id, @RequestBody ProduitsDTO dto) {
        return produitsService.updateProduit(dto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        produitsService.deleteProduit(id);
    }
}