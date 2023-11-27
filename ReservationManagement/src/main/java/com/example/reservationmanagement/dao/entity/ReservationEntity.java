package com.example.reservationmanagement.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="reservations")
@Builder
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "customerId")
    private String customer;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "expertId")
    private String expert;

    private LocalTime reservationStartTime;

    private LocalTime reservationEndTime;

    private LocalDate reservationDate;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
