package org.example.exception;

public class DivideByZeroException extends Exception {
    @Override
    public String getMessage() {
        return "Cannot divide by zero";
    }

}
