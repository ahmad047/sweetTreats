package com.example.sweettreatsapi3.repository;

import com.example.sweettreatsapi3.models.OrderNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderNewRepository extends MongoRepository<OrderNew, Long> {
}
