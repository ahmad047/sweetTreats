package com.example.sweettreatsapi3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private LocalTime shiftStartTime;
    private LocalTime shiftEndTime;
    private int deliveryRange;
    private boolean refrigeratedBoxAvailable;
    private BigDecimal chargePerMile;
    private boolean available = false;
    private boolean preferredCourierStatus;


}
