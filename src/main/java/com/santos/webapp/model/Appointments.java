package com.santos.webapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.Documented;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "appointments")
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "appointment_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp appointmentDate;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctors doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
