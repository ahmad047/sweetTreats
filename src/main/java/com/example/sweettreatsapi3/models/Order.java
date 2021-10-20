package com.example.sweettreatsapi3.models;

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
    private LocalTime time;
    private Integer distance;
    private boolean isRefrigerationRequired;
    private static final BigDecimal MINIMUM_TIP = BigDecimal.valueOf(1);
    private static final BigDecimal MAXIMUM_TIP = BigDecimal.valueOf(3);
    private static final BigDecimal tipPerMile = BigDecimal.valueOf(.75);
    private BigDecimal suggestedTip;

    public Order(String name, LocalTime time, Integer distance, boolean isRefrigerationRequired, BigDecimal suggestedTip) {
        this.name = name;
        this.time = time;
        this.distance = distance;
        this.isRefrigerationRequired = isRefrigerationRequired;
        this.suggestedTip = suggestedTip;
    }
}
