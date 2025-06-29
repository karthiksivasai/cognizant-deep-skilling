package com.example.aaa;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class BankAccountTest {
    
    private BankAccount account;
    private String name;
    private double money;
    
    @Before
    public void setUp() {
        name = "John";
        money = 100.0;
        account = new BankAccount(name, money);
    }
    
    @After
    public void tearDown() {
        account = null;
    }
    
    @Test
    public void testDeposit() {
        double amount = 50.0;
        double expected = money + amount;
        
        account.deposit(amount);
        
        double actual = account.getBalance();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testWithdraw() {
        double amount = 30.0;
        double expected = money - amount;
        
        boolean worked = account.withdraw(amount);
        
        assertTrue(worked);
        double actual = account.getBalance();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testWithdrawTooMuch() {
        double amount = 200.0;
        double expected = money;
        
        boolean worked = account.withdraw(amount);
        
        assertFalse(worked);
        double actual = account.getBalance();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void testAccountHolder() {
        String expected = name;
        
        String actual = account.getAccountHolder();
        
        assertEquals(expected, actual);
    }
} 