package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.models.Order;
import com.example.sweettreatsapi3.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {
    OrderRepository orderRepository;

    @GetMapping
    List<Order> all () {
        return orderRepository.findAll();
    }
}