package com.example.reservationmanagement.dao.repository;

import com.example.reservationmanagement.dao.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

}

