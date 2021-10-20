package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.models.Dummy;
import com.example.sweettreatsapi3.models.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
    @PostMapping("/dummy")
    Dummy create(@RequestBody Dummy dummy){
        return dummy;
    }

}
