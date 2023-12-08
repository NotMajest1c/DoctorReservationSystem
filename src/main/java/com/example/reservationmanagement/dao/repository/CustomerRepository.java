package com.example.reservationmanagement.dao.repository;

import com.example.reservationmanagement.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
