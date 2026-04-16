package com.groupeisi.company.service;

import com.groupeisi.company.dto.ProduitsDTO;
import com.groupeisi.company.entities.Produits;
import com.groupeisi.company.mapper.ProduitsMapper;
import com.groupeisi.company.repository.ProduitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduitsService {

    @Autowired
    private ProduitsRepository produitsRepository;

    public List<ProduitsDTO> getAllProduits() {
        return produitsRepository.findAll()
                .stream()
                .map(ProduitsMapper::toDto)
                .toList();
    }

    @SuppressWarnings("null")
    public ProduitsDTO saveProduit(ProduitsDTO dto) {
        Produits entity = ProduitsMapper.toEntity(dto);
        Produits saved = produitsRepository.save(entity);
        return ProduitsMapper.toDto(saved);
    }

    @SuppressWarnings("null")
    public ProduitsDTO getProduitById(Long id) {
        return produitsRepository.findById(id)
                .map(ProduitsMapper::toDto)
                .orElse(null);
    }

    public ProduitsDTO updateProduit(ProduitsDTO dto, Long id) {
        Produits entity = ProduitsMapper.toEntity(dto);
        entity.setId(id);
        Produits updated = produitsRepository.save(entity);
        return ProduitsMapper.toDto(updated);
    }

    @SuppressWarnings("null")
    public void deleteProduit(Long id) {
        produitsRepository.deleteById(id);
    }
}