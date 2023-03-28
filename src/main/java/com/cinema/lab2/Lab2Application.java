/**
 * The Lab2Application class serves as the entry point for the Spring Boot application.
 * It runs SpringApplication.run() to start the application and perform any necessary configuration.
 * Author: Stanislav Kinash (neprostostas)
 */
package com.cinema.lab2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab2Application {

    /**
     * Main method to start the Spring Boot application
     * @param args Command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(Lab2Application.class, args);
    }

}