package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.repository.OrderRepository2;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class OrderController2 {
    OrderRepository2 dummyRepository;

    @GetMapping("/orders2")
    List<com.example.sweettreatsapi3.models.Order2> all (){
        return dummyRepository.findAll();
    }

    @PostMapping("/orders2")
    com.example.sweettreatsapi3.models.Order2 create(@RequestBody com.example.sweettreatsapi3.models.Order2 dummy){
        return dummyRepository.save(dummy);
    }

}
