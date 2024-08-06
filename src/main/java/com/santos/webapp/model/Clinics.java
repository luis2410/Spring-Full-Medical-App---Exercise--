package com.santos.webapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.print.Doc;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clinics")
public class Clinics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String clinicName;

    private String location;

    @ManyToMany(mappedBy = "clinics", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Doctors> doctors;


}
