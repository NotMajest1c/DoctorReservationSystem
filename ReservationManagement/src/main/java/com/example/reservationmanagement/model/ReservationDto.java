package com.example.reservationmanagement.model;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ReservationDto {

    private String customer;

    private String expert;

    private Integer age;


    private LocalTime reservationStartTime;

    private LocalTime reservationEndTime;

    private LocalDate reservationDate;

}
