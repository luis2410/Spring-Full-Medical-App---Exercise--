package com.santos.webapp.services.impl;

import com.santos.webapp.DTO.ClinicsDTO;
import com.santos.webapp.DTO.DoctorDTO;
import com.santos.webapp.exceptions.DoctorNotFoundException;
import com.santos.webapp.model.Doctors;
import com.santos.webapp.repos.DoctorsRepository;
import com.santos.webapp.services.DoctorsService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DoctorsServiceImpl implements DoctorsService {

    private final DoctorsRepository doctorsRepository;
    @Override
    @Transactional
    public DoctorDTO getDoctor(int doctorId) {
        Doctors doctor = doctorsRepository
                .findById(doctorId).orElseThrow(() -> new DoctorNotFoundException("Doctor not found"));
        return convertToDTO(doctor);
    }

    private DoctorDTO convertToDTO(Doctors doctor) {
        List<ClinicsDTO> clinicsDTOList = doctor.getClinics().stream()
                .map(clinics -> new ClinicsDTO.Builder()
                        .id(clinics.getId())
                        .clinicName(clinics.getClinicName())
                        .location(clinics.getLocation())
                        .build()).toList();

        return new DoctorDTO.Builder()
                .id(doctor.getId())
                .name(doctor.getDoctorsName())
                .clinics(clinicsDTOList).build();
    }
}
