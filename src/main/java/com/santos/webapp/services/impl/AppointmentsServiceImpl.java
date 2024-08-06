package com.santos.webapp.services.impl;

import com.santos.webapp.model.Appointments;

import com.santos.webapp.repos.AppointmentsRepository;
import com.santos.webapp.services.AppointmentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AppointmentsServiceImpl implements AppointmentsService {

    private final AppointmentsRepository appointmentsRepository;

    @Override
    @Transactional
    public Appointments test() {
        Appointments a = appointmentsRepository.findById(1).orElse(new Appointments());
        return a;
    }
}
