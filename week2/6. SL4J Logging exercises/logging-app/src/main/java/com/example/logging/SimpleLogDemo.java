package com.example.logging;

public class SimpleLogDemo {
    
    public static void main(String[] args) {
        System.out.println("Simple Logging Demo");
        System.out.println("==================");
        
        System.out.println("[ERROR] This is an error message");
        System.out.println("[WARN]  This is a warning message");
        System.out.println("[INFO]  This is an info message");
        System.out.println("[DEBUG] This is a debug message");
        
        System.out.println("\nDemonstrating different log levels:");
        printError("Database connection failed");
        printWarn("Low disk space detected");
        printInfo("Application started successfully");
        printDebug("Processing user input: hello");
        
        System.out.println("\nDone with logging demo");
    }
    
    public static void printError(String msg) {
        System.out.println("[ERROR] " + msg);
    }
    
    public static void printWarn(String msg) {
        System.out.println("[WARN]  " + msg);
    }
    
    public static void printInfo(String msg) {
        System.out.println("[INFO]  " + msg);
    }
    
    public static void printDebug(String msg) {
        System.out.println("[DEBUG] " + msg);
    }
} 