package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    
    @Test
    public void testAdd() {
        Calculator myCalculator = new Calculator();
        
        int num1 = 5;
        int num2 = 3;
        int actualResult = myCalculator.add(num1, num2);
        int expectedResult = 8;
        
        assertEquals(expectedResult, actualResult);
    }
} 