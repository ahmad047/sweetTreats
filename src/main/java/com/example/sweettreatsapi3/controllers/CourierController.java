package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.models.Courier;
import com.example.sweettreatsapi3.repository.CourierRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/couriers")
public class CourierController {
    CourierRepository repository;

    @GetMapping
    List<Courier> all() {
        return repository.findAll();
    }
}
