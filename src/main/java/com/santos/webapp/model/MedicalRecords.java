package com.santos.webapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "patient")
@Entity
@Table(name = "medical_records")
public class MedicalRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "medical_history")
    private String medicalHistory;

    private String allergies;

    private String medications;

    @OneToOne
    @JoinColumn(name = "patient_id", unique = true)
    private Patient patient;

}
