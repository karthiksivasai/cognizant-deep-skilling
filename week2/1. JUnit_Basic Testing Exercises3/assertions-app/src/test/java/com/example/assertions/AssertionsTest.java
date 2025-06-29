package com.example.assertions;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {
    
    @Test
    public void testAssertions() {
        
        int number1 = 2;
        int number2 = 3;
        int myResult = number1 + number2;
        assertEquals(5, myResult);
        
        int value1 = 5;
        int value2 = 3;
        boolean checkResult = value1 > value2;
        assertTrue(checkResult);
        
        boolean anotherCheck = value1 < value2;
        assertFalse(anotherCheck);
        
        String emptyValue = null;
        assertNull(emptyValue);
        
        String myString = new String("Hello World");
        assertNotNull(myString);
    }
} 