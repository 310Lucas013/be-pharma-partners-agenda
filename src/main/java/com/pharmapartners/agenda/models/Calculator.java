package com.pharmapartners.agenda.models;

import com.pharmapartners.agenda.exeptions.IllegalInputException;

public class Calculator {
    public double addTwoNumbers(double num1, double num2) throws IllegalInputException {
        if(num1 < 0 || num2 < 0)
            throw new IllegalInputException("Input must be higher than 0");

        return num1 + num2;
    }
}
