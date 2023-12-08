package com.example.reservationmanagement.controller;

import com.example.reservationmanagement.model.ReservationDto;
import com.example.reservationmanagement.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ReservationDto> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    void addReservation(@RequestBody ReservationDto reservationDto, Long expertId, Long customerId) {
        reservationService.addReservation(reservationDto, expertId, customerId);
    }
}