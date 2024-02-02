package org.example.actions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorMultiplyTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new DummyCalculator();
    }

    @Test
    void multiplyPositives() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    void multiplyPositiveByNegative() {
        assertEquals(-10, calculator.multiply(2, -5));
    }

    @Test
    void multiplyNegativeByPositive() {
        assertEquals(-10, calculator.multiply(-2, 5));
    }

    @Test
    void multiplyNegatives() {
        assertEquals(10, calculator.multiply(-2, -5));
    }

    @Test
    void multiplyZeroes() {
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    void multiplyZeroByPositive() {
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void multiplyZeroByNegative() {
        assertEquals(0, calculator.multiply(0, -5));
    }

    @Test
    void multiplyPositiveByOne() {
        assertEquals(7, calculator.multiply(7, 1));
    }

    @Test
    void multiplyNegativeByOne() {
        assertEquals(-7, calculator.multiply(-7, 1));
    }

    @Test
    void multiplyOrderDoesNotMatter() {
        assertEquals(calculator.multiply(6, 3), calculator.multiply(3, 6));
    }
}