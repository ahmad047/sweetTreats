package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.exception.CourierNotFoundAdvice;
import com.example.sweettreatsapi3.exception.CourierNotFoundException;
import com.example.sweettreatsapi3.models.Courier;
import com.example.sweettreatsapi3.repository.CourierRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/couriers")
public class CourierController {
    CourierRepository courierRepository;


    @GetMapping
    List<Courier> all() {
        return courierRepository.findAll();
    }

    // TODO - this is currently not returning a courier
    @GetMapping("/{id}")
    Courier one(@PathVariable Long id) {

        return courierRepository.findById(id) //
                .orElseThrow(() -> new CourierNotFoundException(id));
    }
}
