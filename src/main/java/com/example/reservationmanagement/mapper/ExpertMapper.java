package com.example.reservationmanagement.mapper;



import com.example.reservationmanagement.dao.entity.ExpertEntity;
import com.example.reservationmanagement.dao.entity.FieldEntity;
import com.example.reservationmanagement.model.ExpertDto;
import com.example.reservationmanagement.model.FieldDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ExpertMapper {

    @Mapping(target = "field", expression = "java(expertEntity.getField().getFieldName())")
    ExpertDto expertEntityToDto(ExpertEntity expertEntity);

    @Mapping(source = "fieldEntity", target = "field")
    ExpertEntity expertDtoToEntity(ExpertDto expertDto, FieldEntity fieldEntity);
}
