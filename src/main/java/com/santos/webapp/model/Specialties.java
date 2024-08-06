package com.santos.webapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "specialties")
public class Specialties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String specialtyName;

    @ManyToMany(mappedBy = "specialties", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Doctors> doctors;

}
