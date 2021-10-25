package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.models.Order;
import com.example.sweettreatsapi3.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    OrderRepository orderNewRepository;

    @GetMapping
    List<Order> all (){
        return orderNewRepository.findAll();
    }

    @PostMapping
    Order create(@RequestBody Order dummy){
        return orderNewRepository.save(dummy);
    }

//    TODO
//    @PutMapping("/{id}")



    @DeleteMapping("/{id}")
    void deleteOrder(@PathVariable Long id) {
        orderNewRepository.deleteById(id);
    }

//    TODO
    @GetMapping("/{id}/courier")
    String findBestCourier(@PathVariable Long id) {
        Optional<Order> order = orderNewRepository.findById(id);

        return "the best courier is";
    }

}
