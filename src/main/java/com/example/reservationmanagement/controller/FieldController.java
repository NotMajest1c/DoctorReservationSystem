package com.example.reservationmanagement.controller;

import com.example.reservationmanagement.exceptions.NotFoundException;
import com.example.reservationmanagement.model.FieldDto;
import com.example.reservationmanagement.service.FieldService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fields")
public class FieldController {
    private final FieldService fieldService;

    public FieldController(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<FieldDto> getAllFields(){
        return fieldService.getAllFields();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    void addField(@RequestBody FieldDto fieldDto) {
        fieldService.addField(fieldDto);
    }

    @GetMapping("/findbyid/{id}")
    @ResponseStatus(HttpStatus.OK)
    FieldDto getFieldById(@PathVariable Long id) throws NotFoundException {
        return fieldService.getFieldById(id);
    }

    @GetMapping("/findbyname/{name}")
    @ResponseStatus(HttpStatus.OK)
    FieldDto getFieldByName(@PathVariable String name) throws NotFoundException {
        return fieldService.getFieldByName(name);
    }
}