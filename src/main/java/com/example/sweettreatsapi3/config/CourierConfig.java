package com.example.sweettreatsapi3.config;

import com.example.sweettreatsapi3.models.Courier;
import com.example.sweettreatsapi3.repository.CourierRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalTime;

@Configuration
public class CourierConfig {
    public static final Logger log = LoggerFactory.getLogger(CourierConfig.class);

    @Bean
    public CommandLineRunner initialiseDatabase(CourierRepository repository){
        return args -> {
            Courier bobby = new Courier(
                    1,
                    "bobby",
                    LocalTime.of(9, 0),
                    LocalTime.of(13, 0),
                    5,
                    false,
                    BigDecimal.valueOf(1.75),
                    false,
                    false
            );

            Courier martin = new Courier(
                    2,
                    "martin",
                    LocalTime.of(9, 0),
                    LocalTime.of(17, 0),
                    3,
                    true,
                    BigDecimal.valueOf(1.50),
                    false,
                    false
            );

            Courier geoff = new Courier(
                    3,
                    "geoff",
                    LocalTime.of(10, 0),
                    LocalTime.of(16, 0),
                    4,
                    false,
                    BigDecimal.valueOf(2.00),
                    false,
                    true
            );

            log.info("Preloading " + repository.save(bobby));
            log.info("Preloading " + repository.save(martin));
            log.info("Preloading " + repository.save(geoff));
        };
    }
}
