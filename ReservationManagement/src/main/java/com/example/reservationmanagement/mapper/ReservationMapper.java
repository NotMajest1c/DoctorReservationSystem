package com.example.reservationmanagement.mapper;

import com.example.reservationmanagement.dao.entity.ReservationEntity;
import com.example.reservationmanagement.model.ReservationDto;
import org.mapstruct.Mapping;

public interface ReservationMapper {

    @Mapping(target = "customer", expression = "java(customerEntity.getCustomer().getCustomerName())")
    @Mapping(target = "expert", expression = "java(expertEntity.getExpert().getExpertName())")
    ReservationDto reservationEntityToDto(ReservationEntity reservationEntity);

    @Mapping(source = "customerEntity", target = "customer")
    @Mapping(source = "expertEntity", target = "expert")
    ReservationEntity reservationDtoToEntity(ReservationDto reservationDto);

}
