package com.santos.webapp.controllers;

import com.santos.webapp.DTO.DoctorDTO;
import com.santos.webapp.services.DoctorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
@RequiredArgsConstructor
public class DoctorsController {

    private final DoctorsService doctorsService;

    @GetMapping("/{id}")
    public DoctorDTO getDoctor(@PathVariable(name = "id") int doctorId) {
        return doctorsService.getDoctor(doctorId);


    }
}
