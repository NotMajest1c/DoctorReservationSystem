package com.example.reservationmanagement.service;

import com.example.reservationmanagement.dao.repository.CustomerRepository;
import com.example.reservationmanagement.dao.repository.ExpertRepository;
import com.example.reservationmanagement.dao.repository.ReservationRepository;
import com.example.reservationmanagement.mapper.ReservationMapper;
import com.example.reservationmanagement.model.ReservationDto;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper;

    private final ExpertRepository expertRepository;

    private final CustomerRepository customerRepository;

    public ReservationService(ReservationRepository reservationRepository, ReservationMapper reservationMapper, ExpertRepository expertRepository, CustomerRepository customerRepository) {
        this.reservationRepository = reservationRepository;
        this.reservationMapper = reservationMapper;
        this.expertRepository = expertRepository;
        this.customerRepository = customerRepository;
    }

    public List<ReservationDto> getAllReservations(){
        return reservationRepository.findAll().stream().map(reservationMapper::reservationEntityToDto).toList();
    }

    public void addReservation(ReservationDto reservationDto, Long expertId, Long customerId){
        var entity = reservationMapper.reservationDtoToEntity(reservationDto, expertRepository.findById(expertId).orElseThrow(() -> new NotFoundException("Field Not Found.")), customerRepository.findById(customerId).orElseThrow(() -> new NotFoundException("Field Not Found.")));
        reservationRepository.save(entity);
    }
}