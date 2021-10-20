package com.example.sweettreatsapi3.models;

import com.example.sweettreatsapi3.util.TipCalculator;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalTime;


@NoArgsConstructor
@Data
@ToString
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime time;
    private Integer distance;
    private boolean isRefrigerationRequired;
    private BigDecimal suggestedTip;

    public Order(String name, LocalTime time, Integer distance, boolean isRefrigerationRequired) {
        this.name = name;
        this.time = time;
        this.distance = distance;
        this.isRefrigerationRequired = isRefrigerationRequired;
        this.suggestedTip = TipCalculator.calculate(distance);
    }
}
