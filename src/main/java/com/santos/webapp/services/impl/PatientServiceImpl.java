package com.santos.webapp.services.impl;

import com.santos.webapp.model.Patient;
import com.santos.webapp.repos.PatientRepository;
import com.santos.webapp.services.PatientService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    @Override
    @Transactional(readOnly = true)
    public Patient getPatient(int id) {
        return patientRepository.findById(id).orElse(new Patient());
    }
}
