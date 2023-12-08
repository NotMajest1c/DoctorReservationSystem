package com.example.reservationmanagement.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationDto {

    private String customer;

    private String expert;

    private LocalTime reservationStartTime;

    private LocalTime reservationEndTime;

    private LocalDate reservationDate;

}
