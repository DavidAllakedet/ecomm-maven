package com.groupeisi.company.controllers;

import com.groupeisi.company.dto.AchatsDTO;
import com.groupeisi.company.service.AchatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/achats")
public class AchatsController {

    @Autowired
    private AchatsService achatsService;

    @GetMapping("/all")
    public List<AchatsDTO> getAll() {
        return achatsService.getAllAchats();
    }

    @PostMapping("/create")
    public AchatsDTO create(@RequestBody AchatsDTO dto) {
        return achatsService.saveAchats(dto);
    }

    @PutMapping("/update/{id}")
    public AchatsDTO update(@PathVariable Long id, @RequestBody AchatsDTO dto) {
        return achatsService.updateAchats(dto, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        achatsService.deleteAchats(id);
    }
}