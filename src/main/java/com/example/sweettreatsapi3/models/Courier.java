package com.example.sweettreatsapi3.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalTime;


@NoArgsConstructor
@Data
@ToString
@Document("courier")
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // TODO make it a final field, @allargs will then ignore this
    private String id;
    private String name;
    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime shiftStartTime;
    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime shiftEndTime;
    private double deliveryRange;
    private boolean refrigeratedBoxAvailable;
    private BigDecimal chargePerMile;
    private boolean available = false;
    private boolean preferredCourierStatus;

    public Courier(
            String name,
            LocalTime shiftStartTime,
            LocalTime shiftEndTime,
            int deliveryRange,
            boolean refrigeratedBoxAvailable,
            BigDecimal chargePerMile,
            boolean available,
            boolean preferredCourierStatus
    )
    {
        this.name = name;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.deliveryRange = deliveryRange;
        this.refrigeratedBoxAvailable = refrigeratedBoxAvailable;
        this.chargePerMile = chargePerMile;
        this.available = available;
        this.preferredCourierStatus = preferredCourierStatus;
    }
}
