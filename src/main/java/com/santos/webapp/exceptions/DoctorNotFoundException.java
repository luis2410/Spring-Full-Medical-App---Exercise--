package com.santos.webapp.exceptions;

public class DoctorNotFoundException extends RuntimeException    {
    public DoctorNotFoundException(String message) {
        super(message);
    }
}
