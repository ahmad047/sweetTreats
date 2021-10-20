package com.example.sweettreatsapi3.repository;

import com.example.sweettreatsapi3.models.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummyRepository extends JpaRepository<Dummy, Long> {
}
