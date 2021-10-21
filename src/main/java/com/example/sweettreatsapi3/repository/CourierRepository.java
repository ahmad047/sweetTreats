package com.example.sweettreatsapi3.repository;

import com.example.sweettreatsapi3.models.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourierRepository extends MongoRepository<Courier, String> {
}
