package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.models.Dummy;
import com.example.sweettreatsapi3.models.Order;
import com.example.sweettreatsapi3.repository.DummyRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    DummyRepository dummyRepository;
    @PostMapping("/dummy")
    Dummy create(@RequestBody Dummy dummy){
        return dummyRepository.save(dummy);
    }

}
