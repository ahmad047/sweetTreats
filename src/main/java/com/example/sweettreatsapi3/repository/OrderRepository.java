package com.example.sweettreatsapi3.repository;

import com.example.sweettreatsapi3.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
