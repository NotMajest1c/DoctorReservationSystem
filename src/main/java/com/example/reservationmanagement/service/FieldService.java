package com.example.reservationmanagement.service;

import com.example.reservationmanagement.dao.entity.FieldEntity;
import com.example.reservationmanagement.dao.repository.FieldRepository;
import com.example.reservationmanagement.mapper.FieldMapper;
import com.example.reservationmanagement.model.ExpertDto;
import com.example.reservationmanagement.model.FieldDto;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;


@Service
public class FieldService {
    private final FieldRepository fieldRepository;
    private final FieldMapper fieldMapper;

    public FieldService(FieldRepository fieldRepository, FieldMapper fieldMapper) {
        this.fieldRepository = fieldRepository;
        this.fieldMapper = fieldMapper;
    }

    public List<FieldDto> getAllFields(){
        return fieldRepository.findAll().stream().map(fieldMapper::fieldEntityToDto).toList();
    }

    public void addField(FieldDto fieldDto){
        var entity = fieldMapper.fieldDtoToEntity(fieldDto);
        fieldRepository.save(entity);
    }
    public FieldDto getFieldById(Long fieldId){
        return fieldMapper.fieldEntityToDto(fieldRepository.findById(fieldId).orElseThrow(() -> new NotFoundException("Field not found")));
    }

    public FieldDto getFieldByName(String fieldName){
        return fieldMapper.fieldEntityToDto(fieldRepository.findByFieldName(fieldName));
    }



}
