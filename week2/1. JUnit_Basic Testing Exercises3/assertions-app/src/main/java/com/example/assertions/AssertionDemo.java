package com.example.assertions;

public class AssertionDemo {
    public static void main(String[] args) {
        System.out.println("Testing my assertions");
        
        int a = 2;
        int b = 3;
        int answer = a + b;
        System.out.println("First test: " + a + " + " + b + " = " + answer);
        if (answer == 5) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILED");
        }
        
        int x = 5;
        int y = 3;
        boolean bigger = x > y;
        System.out.println("Second test: " + x + " > " + y + " is " + bigger);
        if (bigger == true) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILED");
        }
        
        boolean smaller = x < y;
        System.out.println("Third test: " + x + " < " + y + " is " + smaller);
        if (smaller == false) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILED");
        }
        
        String nothing = null;
        System.out.println("Fourth test: nothing = " + nothing);
        if (nothing == null) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILED");
        }
        
        String message = new String("Hello World");
        System.out.println("Fifth test: message = " + message);
        if (message != null) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILED");
        }
        
        System.out.println("Done with all tests");
    }
} 