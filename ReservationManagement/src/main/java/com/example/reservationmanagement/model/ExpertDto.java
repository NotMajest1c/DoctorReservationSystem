package com.example.reservationmanagement.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExpertDto {
    private String name;

    private String lastname;

    private Integer age;

    private Short experienceYears;

    private Short experienceMonths;

    private String description;

    //private String field;
}
