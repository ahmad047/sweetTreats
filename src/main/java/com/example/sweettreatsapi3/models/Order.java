package com.example.sweettreatsapi3.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Level;

@NoArgsConstructor
@Data
@ToString
@Document("order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime time;
    private Integer distance;
    private boolean isRefrigerationRequired;

    public Order(String name, LocalTime time, Integer distance, boolean isRefrigerationRequired) {
        this.name = name;
        this.time = time;
        this.distance = distance;
        this.isRefrigerationRequired = isRefrigerationRequired;
    }
}
