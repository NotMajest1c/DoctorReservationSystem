package com.example.reservationmanagement.mapper;

import com.example.reservationmanagement.dao.entity.FieldEntity;
import com.example.reservationmanagement.model.FieldDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T09:13:39+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class FieldMapperImpl implements FieldMapper {

    @Override
    public FieldDto fieldEntityToDto(FieldEntity fieldEntity) {
        if ( fieldEntity == null ) {
            return null;
        }

        FieldDto.FieldDtoBuilder fieldDto = FieldDto.builder();

        fieldDto.fieldName( fieldEntity.getFieldName() );

        return fieldDto.build();
    }

    @Override
    public FieldEntity fieldDtoToEntity(FieldDto fieldDto) {
        if ( fieldDto == null ) {
            return null;
        }

        FieldEntity.FieldEntityBuilder fieldEntity = FieldEntity.builder();

        fieldEntity.fieldName( fieldDto.getFieldName() );

        return fieldEntity.build();
    }
}
