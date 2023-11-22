package com.example.reservationmanagement.dao.repository;

import com.example.reservationmanagement.dao.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

}
