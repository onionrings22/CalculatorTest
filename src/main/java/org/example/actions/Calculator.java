package org.example.actions;

public interface Calculator {
    /**
     * Adds the givens ints and returns their sum
     *
     * @param a  the first addend
     * @param b  the second addend
     */
    int add(int a, int b);

    /**
     * Subtracts the first param from the second
     * and returns the difference
     *
     * @param a  the subtrahend
     * @param b  the minuend
     */
    int subtract(int a, int b);

    /**
     * Multiplies the given ints
     * and returns their product
     *
     * @param a  the first factor
     * @param b  the second factor
     */
    int multiply(int a, int b);

    /**
     * Divides the first param by the second
     * and returns the quotient
     *
     * @param a  the dividend
     * @param b  the divisor
     */
    int divide(int a, int b);
}
