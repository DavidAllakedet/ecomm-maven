package com.groupeisi.company.service;

import com.groupeisi.company.dto.AchatsDTO;
import com.groupeisi.company.entities.Achats;
import com.groupeisi.company.mapper.AchatsMapper;
import com.groupeisi.company.repository.AchatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AchatsService {

    @Autowired
    private AchatsRepository achatsRepository;

    public List<AchatsDTO> getAllAchats() {
        return achatsRepository.findAll()
                .stream()
                .map(AchatsMapper::toDto)
                .toList();
    }

    @SuppressWarnings("null")
    public AchatsDTO saveAchats(AchatsDTO dto) {
        Achats entity = AchatsMapper.toEntity(dto);
        Achats saved = achatsRepository.save(entity);
        return AchatsMapper.toDto(saved);
    }

    @SuppressWarnings("null")
    public AchatsDTO getAchatById(Long id) {
        return achatsRepository.findById(id)
                .map(AchatsMapper::toDto)
                .orElse(null);
    }

    public AchatsDTO updateAchats(AchatsDTO dto, Long id) {
        Achats entity = AchatsMapper.toEntity(dto);
        entity.setId(id);
        Achats updated = achatsRepository.save(entity);
        return AchatsMapper.toDto(updated);
    }

    @SuppressWarnings("null")
    public void deleteAchats(Long id) {
        achatsRepository.deleteById(id);
    }
}