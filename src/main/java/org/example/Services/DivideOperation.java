package org.example.Services;

public class DivideOperation implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    @Override
    public void showResult(double result) {
        System.out.println("El resultado de la division es: " + result);
    }
}
