package com.santos.webapp.DTO;

import lombok.Getter;

@Getter
public class ClinicsDTO {

    // Getters
    private final int id;
    private final String clinicName;
    private final String location;

    // Constructor privado
    private ClinicsDTO(Builder builder) {
        this.id = builder.id;
        this.clinicName = builder.clinicName;
        this.location = builder.location;
    }

    @Override
    public String toString() {
        return "ClinicDTO{" +
                "id=" + id +
                ", clinicName='" + clinicName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    // Builder
    public static class Builder {
        private int id;
        private String clinicName;
        private String location;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder clinicName(String clinicName) {
            this.clinicName = clinicName;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public ClinicsDTO build() {
            return new ClinicsDTO(this);
        }
    }
}