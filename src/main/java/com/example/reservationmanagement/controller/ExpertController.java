package com.example.reservationmanagement.controller;
import com.example.reservationmanagement.model.ExpertDto;
import com.example.reservationmanagement.service.ExpertService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experts")
public class ExpertController {
    private final ExpertService expertService;

    public ExpertController(ExpertService expertService) {
        this.expertService = expertService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<ExpertDto> getAllExperts(){
        return expertService.getAllExperts();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    void addExpert(@RequestBody ExpertDto expertDto, Long fieldId) {
        expertService.addExpert(expertDto, fieldId);
    }
}
