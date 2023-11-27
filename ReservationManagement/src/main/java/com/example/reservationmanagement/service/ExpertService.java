package com.example.reservationmanagement.service;

import com.example.reservationmanagement.dao.repository.ExpertRepository;
import com.example.reservationmanagement.mapper.ExpertMapper;
import com.example.reservationmanagement.model.ExpertDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertService {
    private final ExpertRepository expertRepository;
    private final ExpertMapper expertMapper;

    public ExpertService(ExpertRepository expertRepository, ExpertMapper expertMapper) {
        this.expertRepository = expertRepository;
        this.expertMapper = expertMapper;
    }

    public List<ExpertDto> getAllExperts(){
        return expertRepository.findAll().stream().map(expertMapper::expertEntityToDto).toList();
    }

    public void addExpert(ExpertDto expertDto){
        var entity = expertMapper.expertDtoToEntity(expertDto);
        expertRepository.save(entity);
    }
}
