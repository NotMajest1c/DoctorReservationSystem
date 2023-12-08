package com.example.reservationmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpertDto {
    private String name;

    private String lastname;

    private Integer age;

    private Short experienceYears;

    private Short experienceMonths;

    private String description;

    private String field;
}
