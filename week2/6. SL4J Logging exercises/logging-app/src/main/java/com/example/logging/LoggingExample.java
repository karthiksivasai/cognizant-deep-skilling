package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    
    private static final Logger log = LoggerFactory.getLogger(LoggingExample.class);
    
    public static void main(String[] args) {
        System.out.println("Testing my logger");
        
        log.error("This is an error message");
        log.warn("This is a warning message");
        
        log.info("This is an info message");
        log.debug("This is a debug message");
        
        System.out.println("Done testing");
    }
} 