package com.example.reservationmanagement.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    private String name;

    private String lastname;

    private Integer age;
}
