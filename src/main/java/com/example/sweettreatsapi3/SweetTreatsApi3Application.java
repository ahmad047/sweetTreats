package com.example.sweettreatsapi3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SweetTreatsApi3Application {

    public static void main(String[] args) {
        SpringApplication.run(SweetTreatsApi3Application.class, args);
    }

}
