package com.example.reservationmanagement.mapper;



import com.example.reservationmanagement.dao.entity.CustomerEntity;
import com.example.reservationmanagement.dao.entity.FieldEntity;
import com.example.reservationmanagement.model.CustomerDto;
import com.example.reservationmanagement.model.FieldDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDto customerEntityToDto(CustomerEntity customerEntity);
    CustomerEntity customerDtoToEntity(CustomerDto customerDto);
}
