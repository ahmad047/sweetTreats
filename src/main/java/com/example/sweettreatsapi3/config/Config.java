package com.example.sweettreatsapi3.config;

import com.example.sweettreatsapi3.models.Courier;
import com.example.sweettreatsapi3.repository.CourierRepository;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalTime;

@Configuration
@EnableEncryptableProperties
public class Config {
    public static final Logger log = LoggerFactory.getLogger(Config.class);

    @Bean
    public CommandLineRunner initialiseCouriers(CourierRepository repository){
        return args -> {
            Courier bobby = new Courier(
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

//    @Bean
//    public CommandLineRunner initialiseOrders(OrderRepository orderRepository){
//        return args -> {
//            Order order = new Order(
//                    "dummy",
//                    LocalTime.of(11, 30),
//                    5,
//                    false
//            );
//
//            log.info("Preloading " + orderRepository.save(order));
//        };
//    }


}
