package com.pharmapartners.agenda.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers() {
        Calculator calculator = new Calculator();
        double number1 = 10;
        double number2 = 11;
        double expectedAnswer = 21;

        double actualAnswer = calculator.addTwoNumbers(number1, number2);

        assertEquals(expectedAnswer, actualAnswer);
    }
}