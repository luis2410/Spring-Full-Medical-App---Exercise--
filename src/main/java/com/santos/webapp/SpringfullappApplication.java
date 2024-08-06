package com.santos.webapp;

import com.santos.webapp.model.Doctors;
import com.santos.webapp.services.AppointmentsService;
import com.santos.webapp.services.DoctorsService;
import com.santos.webapp.services.PatientService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringfullappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfullappApplication.class, args);

	}
}
