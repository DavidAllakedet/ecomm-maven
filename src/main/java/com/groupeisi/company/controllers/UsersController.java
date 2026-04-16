package com.groupeisi.company.controllers;

import com.groupeisi.company.dto.UsersDTO;
import com.groupeisi.company.entities.Users;
import com.groupeisi.company.mapper.UsersMapper;
import com.groupeisi.company.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/register")
    public UsersDTO register(@RequestBody UsersDTO dto) {
        Users user = UsersMapper.toEntity(dto);
        Users saved = usersService.save(user);
        return UsersMapper.toDto(saved);
    }

    @GetMapping("/find")
    public Optional<Users> find(@RequestParam String email) {
        return usersService.findByEmail(email);
    }
}