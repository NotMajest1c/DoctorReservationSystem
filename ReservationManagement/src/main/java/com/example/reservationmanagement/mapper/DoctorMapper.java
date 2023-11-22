package com.example.reservationmanagement.mapper;



import com.example.reservationmanagement.dao.entity.DoctorEntity;
import com.example.reservationmanagement.model.DoctorDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorDto doctorEntityToDto(DoctorEntity departmentEntity);
    DoctorEntity doctorDtotoEntity(DoctorDto departmentDto);
}
