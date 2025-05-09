package org.example.Services;

public class SumOperation implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }

    @Override
    public void showResult(double result) {
        System.out.println("El resultado de la suma es: " + result);
    }
}
