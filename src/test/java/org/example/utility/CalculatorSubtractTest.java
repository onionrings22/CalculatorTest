package org.example.utility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorSubtractTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new DefaultCalculator();
    }

    @Test
    void subtractLargePositiveFromSmallPositive() {
        assertEquals(-3, calculator.subtract(2, 5));
    }

    @Test
    void subtractSmallPositiveFromLargePositive() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    void subtractPositiveFromNegative() {
        assertEquals(-7, calculator.subtract(-2, 5));
    }

    @Test
    void subtractNegativeFromPositive() {
        assertEquals(7, calculator.subtract(2, -5));
    }

    @Test
    void subtractLargeNegativeFromSmallNegative() {
        assertEquals(3, calculator.subtract(-2, -5));
    }

    @Test
    void subtractSmallNegativeFromLargeNegative() {
        assertEquals(-3, calculator.subtract(-5, -2));
    }

    @Test
    void subtractZeroes() {
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    void subtractZeroFromPositive() {
        assertEquals(5, calculator.subtract(5, 0));
    }

    @Test
    void subtractZeroFromNegative() {
        assertEquals(-5, calculator.subtract(-5, 0));
    }

    @Test
    void subtractNegativeFromZero() {
        assertEquals(3, calculator.subtract(0, -3));
    }

    @Test
    void subtractPositiveFromZero() {
        assertEquals(-3, calculator.subtract(0, 3));
    }

    @Test
    void subtractPositiveFromItself() {
        assertEquals(0, calculator.subtract(3, 3));
    }

    @Test
    void subtractNegativeFromItself() {
        assertEquals(0, calculator.subtract(-3, -3));
    }

    @Test
    void subtractOrderDoesMatter() {
        assertNotEquals(calculator.subtract(6, 3), calculator.subtract(3, 6));
    }
}