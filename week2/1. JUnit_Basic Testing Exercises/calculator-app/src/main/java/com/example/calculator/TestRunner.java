package com.example.calculator;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Testing my Calculator app");
        System.out.println("========================");
        
        Calculator calc = new Calculator();
        
        System.out.println("Test 1: Adding 5 + 3");
        int result1 = calc.add(5, 3);
        System.out.println("Got: " + result1);
        if (result1 == 8) {
            System.out.println("SUCCESS - Test passed!");
        } else {
            System.out.println("FAILED - Expected 8");
        }
        
        System.out.println();
        System.out.println("Test 2: Adding 10 + 20");
        int result2 = calc.add(10, 20);
        System.out.println("Got: " + result2);
        if (result2 == 30) {
            System.out.println("SUCCESS - Test passed!");
        } else {
            System.out.println("FAILED - Expected 30");
        }
        
        System.out.println();
        System.out.println("Test 3: Adding 0 + 0");
        int result3 = calc.add(0, 0);
        System.out.println("Got: " + result3);
        if (result3 == 0) {
            System.out.println("SUCCESS - Test passed!");
        } else {
            System.out.println("FAILED - Expected 0");
        }
        
        System.out.println();
        System.out.println("Test 4: Adding negative numbers -5 + 5");
        int result4 = calc.add(-5, 5);
        System.out.println("Got: " + result4);
        if (result4 == 0) {
            System.out.println("SUCCESS - Test passed!");
        } else {
            System.out.println("FAILED - Expected 0");
        }
        
        System.out.println();
        System.out.println("All tests completed!");
    }
} 