package com.santos.webapp.repos;

import com.santos.webapp.model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Transactional()
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
