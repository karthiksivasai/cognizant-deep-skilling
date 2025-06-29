package com.example.aaa;

public class TestDemo {
    public static void main(String[] args) {
        System.out.println("Testing my bank account");
        
        BankAccount acc1 = new BankAccount("John", 100.0);
        System.out.println("Test 1: Starting with " + acc1.getBalance());
        acc1.deposit(50.0);
        double bal1 = acc1.getBalance();
        System.out.println("After deposit: " + bal1);
        if (bal1 == 150.0) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILED");
        }
        
        BankAccount acc2 = new BankAccount("Jane", 100.0);
        System.out.println("Test 2: Starting with " + acc2.getBalance());
        boolean result1 = acc2.withdraw(30.0);
        double bal2 = acc2.getBalance();
        System.out.println("After withdraw: " + bal2 + ", worked: " + result1);
        if (result1 == true && bal2 == 70.0) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILED");
        }
        
        BankAccount acc3 = new BankAccount("Bob", 100.0);
        System.out.println("Test 3: Starting with " + acc3.getBalance());
        boolean result2 = acc3.withdraw(200.0);
        double bal3 = acc3.getBalance();
        System.out.println("After big withdraw: " + bal3 + ", worked: " + result2);
        if (result2 == false && bal3 == 100.0) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILED");
        }
        
        System.out.println("Done testing");
    }
} 