package org.example.utility;

import org.example.exception.DivideByZeroException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorDivideTest {
    private Calculator calculator;

    @BeforeEach
    void setup() throws DivideByZeroException {
        calculator = new DefaultCalculator();
    }

    @Test
    void divideLargePositiveBySmallPositive() throws DivideByZeroException {
        assertEquals(2, calculator.divide(5, 2));
    }

    @Test
    void divideSmallPositiveByLargePositive() throws DivideByZeroException {
        assertEquals(0, calculator.divide(2, 5));
    }

    @Test
    void dividePositiveByNegative() throws DivideByZeroException {
        assertEquals(-2, calculator.divide(5, -2));
    }

    @Test
    void divideNegativeByPositive() throws DivideByZeroException {
        assertEquals(-2, calculator.divide(-5, 2));
    }

    @Test
    void divideLargeNegativeBySmallNegative() throws DivideByZeroException {
        assertEquals(2, calculator.divide(-7, -3));
    }

    @Test
    void divideSmallNegativeByLargeNegative() throws DivideByZeroException {
        assertEquals(0, calculator.divide(-3, -7));
    }

    @Test
    void divideZeroByZero() throws DivideByZeroException {
        assertThrows(DivideByZeroException.class, () -> {calculator.divide(0, 0);});
    }

    @Test
    void divideZeroByPositive() throws DivideByZeroException {
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    void divideZeroByNegative() throws DivideByZeroException {
        assertEquals(0, calculator.divide(0, -5));
    }

    @Test
    void divideNegativeByZero() throws DivideByZeroException {
        assertThrows(DivideByZeroException.class, () -> {calculator.divide(-8, 0);});
    }

    @Test
    void dividePositiveByZero() throws DivideByZeroException {
        assertThrows(DivideByZeroException.class, () -> {calculator.divide(8, 0);});
    }

    @Test
    void dividePositiveByItself() throws DivideByZeroException {
        assertEquals(1, calculator.divide(3, 3));
    }

    @Test
    void divideNegativeByItself() throws DivideByZeroException {
        assertEquals(1, calculator.divide(-3, -3));
    }

    @Test
    void divideOrderDoesMatter() throws DivideByZeroException {
        assertNotEquals(calculator.divide(6, 3), calculator.divide(3, 6));
    }
}