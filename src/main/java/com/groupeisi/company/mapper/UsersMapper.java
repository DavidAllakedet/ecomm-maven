package com.groupeisi.company.mapper;

import com.groupeisi.company.dto.UsersDTO;
import com.groupeisi.company.entities.Users;

public class UsersMapper {
    public static UsersDTO toDto(Users entity) {
        if (entity == null) return null;
        UsersDTO dto = new UsersDTO();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        return dto;
    }

    public static Users toEntity(UsersDTO dto) {
        if (dto == null) return null;
        Users entity = new Users();
        entity.setId(dto.getId());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        return entity;
    }
}