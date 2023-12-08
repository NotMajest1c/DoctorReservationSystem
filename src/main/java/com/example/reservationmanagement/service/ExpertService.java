package com.example.reservationmanagement.service;

import com.example.reservationmanagement.dao.repository.ExpertRepository;
import com.example.reservationmanagement.dao.repository.FieldRepository;
import com.example.reservationmanagement.mapper.ExpertMapper;
import com.example.reservationmanagement.model.ExpertDto;

import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
public class ExpertService {
    private final ExpertRepository expertRepository;
    private final ExpertMapper expertMapper;

    private final FieldRepository fieldRepository;

    public ExpertService(ExpertRepository expertRepository, ExpertMapper expertMapper, FieldRepository fieldRepository) {
        this.expertRepository = expertRepository;
        this.expertMapper = expertMapper;
        this.fieldRepository = fieldRepository;
    }

    public List<ExpertDto> getAllExperts(){
        return expertRepository.findAll().stream().map(expertMapper::expertEntityToDto).toList();
    }

    public void addExpert(ExpertDto expertDto, Long fieldId){
        var entity = expertMapper.expertDtoToEntity(expertDto, fieldRepository.findById(fieldId).orElseThrow(() -> new NotFoundException("Field Not Found.")));
        expertRepository.save(entity);
    }
}
