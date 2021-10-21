package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.exception.CourierNotFoundAdvice;
import com.example.sweettreatsapi3.exception.CourierNotFoundException;
import com.example.sweettreatsapi3.models.Courier;
import com.example.sweettreatsapi3.models.OrderNew;
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

    @GetMapping("/{id}")
    Courier findOneCourier(@PathVariable Long id) {

        return courierRepository.findById(id) //
                .orElseThrow(() -> new CourierNotFoundException(id));
    }

    @PostMapping
    Courier newCourier(@RequestBody Courier newCourier) {
        return courierRepository.save(newCourier);
    }

    //    TODO
//    @PutMapping("/{id}")

    @DeleteMapping("/{id}")
    void deleteCourier(@PathVariable Long id) {
        courierRepository.deleteById(id);
    }


}
