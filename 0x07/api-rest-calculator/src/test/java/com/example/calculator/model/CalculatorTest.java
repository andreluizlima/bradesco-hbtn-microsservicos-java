package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    private Calculator calculator = new Calculator();   

    @Test
    void sumTest() {
        assertEquals(10, calculator.sum(5.0, 5.0));
    }

    @Test
    public void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calculator.sum(null, 5.0));
    }

    @Test
    void subTest() {
       assertEquals(0, calculator.sub(5.0, 5.0));
       assertThrows(NullPointerException.class, () -> calculator.sub(null, 5.0));
       assertThrows(NullPointerException.class, () -> calculator.sub(5.0, null));
       assertThrows(NullPointerException.class, () -> calculator.sub(null, null));
    }

    @Test
    void divideTest() {
       assertEquals(1, calculator.divide(5.0, 5.0));
       assertThrows(NullPointerException.class, () -> calculator.divide(null, 5.0));
       assertThrows(NullPointerException.class, () -> calculator.divide(5.0, null));
       assertThrows(NullPointerException.class, () -> calculator.divide(null, null));
       assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }

    @Test
    public void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }

    @Test
    void factorialTest() {
        assertEquals(120, calculator.factorial(5));
        assertThrows(NullPointerException.class, () -> calculator.factorial(null));
    }

    @Test
    void integerToBinaryTest() {
       assertEquals(101, calculator.integerToBinary(5));
       assertThrows(NullPointerException.class, () -> calculator.integerToBinary(null));
    }

    @Test
    void integerToHexadecimalTest() {
       assertEquals("5", calculator.integerToHexadecimal(5));
       assertThrows(NullPointerException.class, () -> calculator.integerToHexadecimal(null));
    }

    @Test
    void calculeDayBetweenDateTest() {
       assertEquals(14, calculator.calculeDayBetweenDate(LocalDate.of(2020, 3, 15), LocalDate.of(2020, 3, 29)));
       assertThrows(NullPointerException.class, () -> calculator.calculeDayBetweenDate(null, LocalDate.of(2020, 3, 29)));
       assertThrows(NullPointerException.class, () -> calculator.calculeDayBetweenDate(LocalDate.of(2020, 3, 15), null));
       assertThrows(NullPointerException.class, () -> calculator.calculeDayBetweenDate(null, null));
    }
}