package com.sudokuSolve.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sudokuSolve.restservice", "com.sudokuSolve.restapi"})
public class SudokuRestApiApplication {

        public static void main(String[] args) {
            SpringApplication.run(SudokuRestApiApplication.class, args);
        }
}
