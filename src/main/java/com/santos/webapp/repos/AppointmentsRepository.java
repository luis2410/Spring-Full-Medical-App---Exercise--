package com.santos.webapp.repos;


import com.santos.webapp.model.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments, Integer> {
}
