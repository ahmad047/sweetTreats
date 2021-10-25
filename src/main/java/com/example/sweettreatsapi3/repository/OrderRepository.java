package com.example.sweettreatsapi3.repository;

import com.example.sweettreatsapi3.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, Long> {
}
