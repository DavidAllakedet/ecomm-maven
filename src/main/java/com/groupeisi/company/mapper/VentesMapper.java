package com.groupeisi.company.mapper;

import com.groupeisi.company.dto.VentesDTO;
import com.groupeisi.company.entities.Ventes;

public class VentesMapper {
    public static VentesDTO toDto(Ventes entity) {
        if (entity == null) return null;
        VentesDTO dto = new VentesDTO();
        dto.setId(entity.getId());
        dto.setDateP(entity.getDateP());
        dto.setQuantity(entity.getQuantity());
        dto.setProductId(entity.getProduit() != null ? entity.getProduit().getId() : null);
        dto.setUserId(entity.getUser() != null ? entity.getUser().getId() : null);
        return dto;
    }

    public static Ventes toEntity(VentesDTO dto) {
        if (dto == null) return null;
        Ventes entity = new Ventes();
        entity.setId(dto.getId());
        entity.setDateP(dto.getDateP());
        entity.setQuantity(dto.getQuantity());
        // Production and user must be set separately if needed
        return entity;
    }
}