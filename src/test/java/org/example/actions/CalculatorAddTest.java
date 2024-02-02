package org.example.actions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorAddTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new DummyCalculator();
    }

    @Test
    void addPositives() {
        assertEquals(7, calculator.add(2, 5));
    }

    @Test
    void addPositiveToNegative() {
        assertEquals(-3, calculator.add(2, -5));
    }

    @Test
    void addNegativeToPositive() {
        assertEquals(3, calculator.add(-2, 5));
    }

    @Test
    void addNegatives() {
        assertEquals(-7, calculator.add(-2, -5));
    }

    @Test
    void addZeroes() {
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void addZeroToPositive() {
        assertEquals(5, calculator.add(0, 5));
    }

    @Test
    void addZeroToNegative() {
        assertEquals(-5, calculator.add(0, -5));
    }

    @Test
    void addNegativeToZero() {
        assertEquals(-3, calculator.add(-3, 0));
    }

    @Test
    void addPositiveToZero() {
        assertEquals(3, calculator.add(3, 0));
    }

    @Test
    void addOrderDoesNotMatter() {
        assertEquals(calculator.add(6, 3), calculator.add(3, 6));
    }
}