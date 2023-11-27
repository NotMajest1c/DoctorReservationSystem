package com.example.reservationmanagement.mapper;



import com.example.reservationmanagement.dao.entity.ExpertEntity;
import com.example.reservationmanagement.model.ExpertDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ExpertMapper {
    //@Mapping(target = "field", expression = "java(fieldEntity.getField().getFieldName())")
    ExpertDto expertEntityToDto(ExpertEntity expertEntity);

    //@Mapping(source = "field", target = "field")
    ExpertEntity expertDtoToEntity(ExpertDto expertDto);
}
