package com.example.reservationmanagement.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DoctorDto {
    private String name;
    private String lastname;
    private Integer age;
}
