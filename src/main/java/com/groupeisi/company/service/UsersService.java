package com.groupeisi.company.service;

import com.groupeisi.company.dto.UsersDTO;
import com.groupeisi.company.entities.Users;
import com.groupeisi.company.mapper.UsersMapper;
import com.groupeisi.company.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public Optional<Users> findByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    @SuppressWarnings("null")
    public Users save(Users user) {
        return usersRepository.save(user);
    }

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @SuppressWarnings("null")
    public UsersDTO getUserById(Long id) {
        return usersRepository.findById(id)
                .map(UsersMapper::toDto)
                .orElse(null);
    }

    @SuppressWarnings("null")
    public UsersDTO saveUser(UsersDTO dto) {
        Users entity = UsersMapper.toEntity(dto);
        Users saved = usersRepository.save(entity);
        return UsersMapper.toDto(saved);
    }

    public UsersDTO updateUser(UsersDTO dto, Long id) {
        Users entity = UsersMapper.toEntity(dto);
        entity.setId(id);
        Users updated = usersRepository.save(entity);
        return UsersMapper.toDto(updated);
    }

    @SuppressWarnings("null")
    public void deleteUser(Long id) {
        usersRepository.deleteById(id);
    }
}