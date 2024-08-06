package com.santos.webapp.repos;

import com.santos.webapp.model.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctors, Integer> {
}
