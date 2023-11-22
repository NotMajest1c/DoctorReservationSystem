package com.example.reservationmanagement.mapper;

import com.example.reservationmanagement.dao.entity.DoctorEntity;
import com.example.reservationmanagement.model.DoctorDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-15T01:26:14+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public DoctorDto doctorEntityToDto(DoctorEntity departmentEntity) {
        if ( departmentEntity == null ) {
            return null;
        }

        DoctorDto.DoctorDtoBuilder doctorDto = DoctorDto.builder();

        doctorDto.name( departmentEntity.getName() );
        doctorDto.lastname( departmentEntity.getLastname() );
        doctorDto.age( departmentEntity.getAge() );

        return doctorDto.build();
    }

    @Override
    public DoctorEntity doctorDtotoEntity(DoctorDto departmentDto) {
        if ( departmentDto == null ) {
            return null;
        }

        DoctorEntity.DoctorEntityBuilder doctorEntity = DoctorEntity.builder();

        doctorEntity.name( departmentDto.getName() );
        doctorEntity.lastname( departmentDto.getLastname() );
        doctorEntity.age( departmentDto.getAge() );

        return doctorEntity.build();
    }
}
