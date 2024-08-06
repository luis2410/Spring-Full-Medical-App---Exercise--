package com.santos.webapp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString(exclude = "medicalRecords")
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String patientName;

    @Temporal(TemporalType.DATE)
    private Date birthdate;

    private char gender;

    @OneToOne(mappedBy = "patient", fetch = FetchType.EAGER)
    private MedicalRecords medicalRecords;


}
