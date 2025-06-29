package com.example.aaa;

public class BankAccount {
    private double balance;
    private String name;
    
    public BankAccount(String accountName, double money) {
        this.name = accountName;
        this.balance = money;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
    }
    
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountHolder() {
        return name;
    }
} 