package com.example.reservationmanagement.dao.repository;

import com.example.reservationmanagement.dao.entity.FieldEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldRepository extends JpaRepository<FieldEntity, Long> {
    FieldEntity findByFieldName(String fieldName);
}
