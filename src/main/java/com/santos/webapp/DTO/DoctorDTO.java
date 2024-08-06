package com.santos.webapp.DTO;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Getter
public class DoctorDTO {
    private final int id;
    private final String name;
    private final List<ClinicsDTO> clinics;

    // Constructor privado
    private DoctorDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.clinics = builder.clinics;
    }

    public static class Builder {
        private int id;
        private String name;
        private List<ClinicsDTO> clinics;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder clinics(List<ClinicsDTO> clinics) {
            this.clinics = clinics;
            return this;
        }

        public DoctorDTO build() {
            return new DoctorDTO(this);
        }
    }
}