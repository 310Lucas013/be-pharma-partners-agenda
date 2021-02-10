package com.pharmapartners.agenda.models;

public class Calculator {
    public double addTwoNumbers(double num1, double num2) throws Throwable {
        if(num1 < 0 || num2 < 0)
            throw new IllegalArgumentException("Number can't be lower than 0");

        return num1 + num2;
    }
}
