package com.example.greetingrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.restservice", "com.example.greetingrestapi"})
public class GreetingRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingRestApiApplication.class, args);
    }

}
