package com.example.sweettreatsapi3.exception;

public class CourierNotFoundException extends RuntimeException {
    public CourierNotFoundException(String id) {
        super("Could not find employee " + id);
    }
}
