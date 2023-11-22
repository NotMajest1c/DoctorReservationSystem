package com.example.reservationmanagement.service;

import com.example.reservationmanagement.dao.repository.DoctorRepository;
import com.example.reservationmanagement.mapper.DoctorMapper;
import com.example.reservationmanagement.model.DoctorDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    public DoctorService(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }

    public List<DoctorDto> getAllDoctors(){
        return doctorRepository.findAll().stream().map(doctorMapper::doctorEntityToDto).toList();
    }

    public void addDoctor(DoctorDto doctorDto){
        var entity = doctorMapper.doctorDtotoEntity(doctorDto);
        doctorRepository.save(entity);
    }
}
