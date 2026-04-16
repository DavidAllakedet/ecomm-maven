package com.groupeisi.company.mapper;

import com.groupeisi.company.dto.AchatsDTO;
import com.groupeisi.company.entities.Achats;

public class AchatsMapper {
    public static AchatsDTO toDto(Achats entity) {
        if (entity == null) return null;
        AchatsDTO dto = new AchatsDTO();
        dto.setId(entity.getId());
        dto.setDateP(entity.getDateP());
        dto.setQuantity(entity.getQuantity());
        dto.setProductId(entity.getProduit() != null ? entity.getProduit().getId() : null);
        dto.setUserId(entity.getUser() != null ? entity.getUser().getId() : null);
        return dto;
    }

    public static Achats toEntity(AchatsDTO dto) {
        if (dto == null) return null;
        Achats entity = new Achats();
        entity.setId(dto.getId());
        entity.setDateP(dto.getDateP());
        entity.setQuantity(dto.getQuantity());
        return entity;
    }
}