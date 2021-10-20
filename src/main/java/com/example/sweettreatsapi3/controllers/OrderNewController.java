package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.models.OrderNew;
import com.example.sweettreatsapi3.repository.OrderNewRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderNewController {
    OrderNewRepository orderNewRepository;

    @GetMapping
    List<OrderNew> all (){
        return orderNewRepository.findAll();
    }

    @PostMapping
    OrderNew create(@RequestBody OrderNew dummy){
        return orderNewRepository.save(dummy);
    }

}
