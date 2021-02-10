package com.pharmapartners.agenda.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void addTwoNumbers() {
        Calculator calculator = new Calculator();
        int number1 = 15;
        int number2 = 7;


        double actualAnswer = calculator.addTwoNumbers(number1, number2);
        double expectedAnser = 22;

        assertEquals(expectedAnser, actualAnswer);
    }

}
