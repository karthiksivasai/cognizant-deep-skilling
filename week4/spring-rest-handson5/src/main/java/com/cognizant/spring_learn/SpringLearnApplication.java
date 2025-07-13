package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cognizant")
public class SpringLearnApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }
} 