package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

/**
 * Unit test for Calculator.
 */
public class CalculatorTests {

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

     @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        Assertions.assertEquals("Division by zero is not allowed", exception.getMessage());
    }

}
