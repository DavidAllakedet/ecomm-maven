package com.groupeisi.company.service;

import com.groupeisi.company.dto.VentesDTO;
import com.groupeisi.company.entities.Ventes;
import com.groupeisi.company.mapper.VentesMapper;
import com.groupeisi.company.repository.VentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VentesService {

    @Autowired
    private VentesRepository ventesRepository;

    public List<VentesDTO> getAllVentes() {
        return ventesRepository.findAll()
                .stream()
                .map(VentesMapper::toDto)
                .toList();
    }

    public VentesDTO saveVentes(VentesDTO dto) {
        Ventes entity = VentesMapper.toEntity(dto);
        Ventes saved = ventesRepository.save(entity);
        return VentesMapper.toDto(saved);
    }

    public VentesDTO updateVentes(VentesDTO dto, Long id) {
        Ventes entity = VentesMapper.toEntity(dto);
        entity.setId(id);
        Ventes updated = ventesRepository.save(entity);
        return VentesMapper.toDto(updated);
    }

    public void deleteVentes(Long id) {
        ventesRepository.deleteById(id);
    }
}