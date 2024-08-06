package com.santos.webapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "doctors")
public class Doctors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String doctorsName;

    @ManyToMany( fetch = FetchType.EAGER)
    @JoinTable(
            name = "doctor_clinics",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "clinic_id")
    )
    private List<Clinics> clinics;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "doctor_specialties",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id")
    )
    private List<Specialties> specialties;

}
