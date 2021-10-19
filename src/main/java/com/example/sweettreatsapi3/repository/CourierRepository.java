package com.example.sweettreatsapi3.repository;

import com.example.sweettreatsapi3.models.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<Courier, Long> {
}
