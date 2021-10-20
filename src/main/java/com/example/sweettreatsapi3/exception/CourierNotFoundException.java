package com.example.sweettreatsapi3.exception;

public class CourierNotFoundException extends RuntimeException {
    public CourierNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
