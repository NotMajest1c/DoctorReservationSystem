package com.example.reservationmanagement.mapper;



import com.example.reservationmanagement.dao.entity.FieldEntity;
import com.example.reservationmanagement.model.FieldDto;
import org.mapstruct.Mapper;

import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface FieldMapper {
    FieldDto fieldEntityToDto(FieldEntity fieldEntity);
    FieldEntity fieldDtoToEntity(FieldDto fieldDto);
}
