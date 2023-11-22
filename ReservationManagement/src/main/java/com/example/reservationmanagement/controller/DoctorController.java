package com.example.reservationmanagement.controller;
import com.example.reservationmanagement.model.DoctorDto;
import com.example.reservationmanagement.service.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<DoctorDto> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    void addEmployee(@RequestBody DoctorDto doctorDto) {
        doctorService.addDoctor(doctorDto);
    }
}
