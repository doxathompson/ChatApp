package com.doxa.chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marks this class as the main entry point for the Spring Boot application
@SpringBootApplication
public class ChatAppApplication {

    // Main method that starts the Spring Boot application
    public static void main(String[] args) {
        // Launches the application using Spring Boot's built-in server
        SpringApplication.run(ChatAppApplication.class, args);
    }

}
