package com.example.sweettreatsapi3.controllers;

import com.example.sweettreatsapi3.models.OrderNew;
import com.example.sweettreatsapi3.repository.OrderNewRepository;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
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

//    TODO
//    @PutMapping("/{id}")



    @DeleteMapping("/{id}")
    void deleteOrder(@PathVariable Long id) {
        orderNewRepository.deleteById(id);
    }

}
