package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.exception.CourierNotFoundAdvice;
import com.example.sweettreatsapi3.exception.CourierNotFoundException;
import com.example.sweettreatsapi3.models.Courier;
import com.example.sweettreatsapi3.repository.CourierRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/couriers")
public class CourierController {
    CourierRepository courierRepository;


    @GetMapping
    List<Courier> findAllCouriers() {
        return courierRepository.findAll();
    }

    // TODO - this is currently not returning a courier
    @GetMapping("/{id}")
    Courier findOneCourier(@PathVariable Long id) {

        return courierRepository.findById(id) //
                .orElseThrow(() -> new CourierNotFoundException(id));
    }

    @PostMapping
    Courier newCourier(@RequestBody Courier newCourier){
        return courierRepository.save(newCourier);
    }
}
