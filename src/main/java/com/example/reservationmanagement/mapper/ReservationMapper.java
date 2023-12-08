package com.example.reservationmanagement.mapper;

import com.example.reservationmanagement.dao.entity.CustomerEntity;
import com.example.reservationmanagement.dao.entity.ExpertEntity;
import com.example.reservationmanagement.dao.entity.ReservationEntity;
import com.example.reservationmanagement.model.ReservationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ReservationMapper {

    @Mapping(target = "customer", expression = "java(reservationEntity.getCustomer().getName())")
    @Mapping(target = "expert", expression = "java(reservationEntity.getExpert().getName())")
    ReservationDto reservationEntityToDto(ReservationEntity reservationEntity);

    @Mapping(source = "customerEntity", target = "customer")
    @Mapping(source = "expertEntity", target = "expert")
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    ReservationEntity reservationDtoToEntity(ReservationDto reservationDto, ExpertEntity expertEntity, CustomerEntity customerEntity);

}
