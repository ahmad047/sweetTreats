package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.models.Courier;
import com.example.sweettreatsapi3.models.OrderNew;
import com.example.sweettreatsapi3.repository.OrderNewRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

//    TODO
//    @PutMapping("/{id}")



    @DeleteMapping("/{id}")
    void deleteOrder(@PathVariable Long id) {
        orderNewRepository.deleteById(id);
    }

//    TODO
    @GetMapping("/{id}/courier")
    String findBestCourier(@PathVariable Long id) {
        OrderNew order = orderNewRepository.getById(id);

        return "the best courier is";
    }

}
