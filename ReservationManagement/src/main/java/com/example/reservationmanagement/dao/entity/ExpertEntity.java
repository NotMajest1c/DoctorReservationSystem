package com.example.reservationmanagement.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="experts")
@Builder

public class ExpertEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expertId;

    private String name;

    private String lastname;

    private Integer age;

    @Column(updatable = false)
    private String username;

    private String password;

    private Short experienceYears;

    private Short experienceMonths;

    private String description;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "fieldId")
    private String field;




    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
