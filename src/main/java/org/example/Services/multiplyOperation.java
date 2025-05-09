package org.example.Services;

public class multiplyOperation implements OperationStrategy {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
