package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.exception.CourierNotFoundException;
import com.example.sweettreatsapi3.models.Courier;
import com.example.sweettreatsapi3.repository.CourierRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    Courier findOneCourier(@PathVariable String id) {

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
    void deleteCourier(@PathVariable String id) {
        courierRepository.deleteById(id);
    }


}
