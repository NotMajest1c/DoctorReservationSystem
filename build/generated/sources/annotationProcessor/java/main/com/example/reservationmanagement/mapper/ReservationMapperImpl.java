package com.example.reservationmanagement.mapper;

import com.example.reservationmanagement.dao.entity.CustomerEntity;
import com.example.reservationmanagement.dao.entity.ExpertEntity;
import com.example.reservationmanagement.dao.entity.ReservationEntity;
import com.example.reservationmanagement.model.ReservationDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T09:13:39+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationDto reservationEntityToDto(ReservationEntity reservationEntity) {
        if ( reservationEntity == null ) {
            return null;
        }

        ReservationDto.ReservationDtoBuilder reservationDto = ReservationDto.builder();

        reservationDto.reservationStartTime( reservationEntity.getReservationStartTime() );
        reservationDto.reservationEndTime( reservationEntity.getReservationEndTime() );
        reservationDto.reservationDate( reservationEntity.getReservationDate() );

        reservationDto.customer( reservationEntity.getCustomer().getName() );
        reservationDto.expert( reservationEntity.getExpert().getName() );

        return reservationDto.build();
    }

    @Override
    public ReservationEntity reservationDtoToEntity(ReservationDto reservationDto, ExpertEntity expertEntity, CustomerEntity customerEntity) {
        if ( reservationDto == null && expertEntity == null && customerEntity == null ) {
            return null;
        }

        ReservationEntity.ReservationEntityBuilder reservationEntity = ReservationEntity.builder();

        if ( reservationDto != null ) {
            reservationEntity.reservationStartTime( reservationDto.getReservationStartTime() );
            reservationEntity.reservationEndTime( reservationDto.getReservationEndTime() );
            reservationEntity.reservationDate( reservationDto.getReservationDate() );
        }
        reservationEntity.expert( expertEntity );
        reservationEntity.customer( customerEntity );

        return reservationEntity.build();
    }
}
