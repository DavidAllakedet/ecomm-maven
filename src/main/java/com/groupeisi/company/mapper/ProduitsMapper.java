package com.groupeisi.company.mapper;

import com.groupeisi.company.dto.ProduitsDTO;
import com.groupeisi.company.entities.Produits;

public class ProduitsMapper {
    public static ProduitsDTO toDto(Produits entity) {
        if (entity == null) return null;
        ProduitsDTO dto = new ProduitsDTO();
        dto.setId(entity.getId());
        dto.setRef(entity.getRef());
        dto.setName(entity.getName());
        dto.setStock(entity.getStock());
        dto.setUserId(entity.getUser() != null ? entity.getUser().getId() : null);
        return dto;
    }

    public static Produits toEntity(ProduitsDTO dto) {
        if (dto == null) return null;
        Produits entity = new Produits();
        entity.setId(dto.getId());
        entity.setRef(dto.getRef());
        entity.setName(dto.getName());
        entity.setStock(dto.getStock());
        // user set separately if needed
        return entity;
    }
}