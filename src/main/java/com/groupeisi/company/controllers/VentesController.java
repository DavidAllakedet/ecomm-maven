package com.groupeisi.company.controllers;

import com.groupeisi.company.dto.VentesDTO;
import com.groupeisi.company.service.VentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ventes")
public class VentesController {

    @Autowired
    private VentesService ventesService;

    @GetMapping("/all")
    public List<VentesDTO> getAll() {
        return ventesService.getAllVentes();
    }

    @PostMapping("/create")
    public VentesDTO create(@RequestBody VentesDTO dto) {
        return ventesService.saveVentes(dto);
    }

    @PutMapping("/update/{id}")
    public VentesDTO update(@PathVariable Long id, @RequestBody VentesDTO dto) {
        return ventesService.updateVentes(dto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ventesService.deleteVentes(id);
    }
}