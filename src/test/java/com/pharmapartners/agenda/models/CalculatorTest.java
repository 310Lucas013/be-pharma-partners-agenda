package com.pharmapartners.agenda.models;

import com.pharmapartners.agenda.exeptions.IllegalInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers() throws IllegalArgumentException {
        Calculator calculator = new Calculator();
        double number1 = 10;
        double number2 = 11;
        double expectedAnswer = 21;

        double actualAnswer = calculator.addTwoNumbers(number1, number2);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void addingOneNumberBelow_0_ShouldThrow_IllegalInputException() throws Exception{
        Calculator calculator = new Calculator();
        double number1 = 10;
        double number2 = -1;

        assertThrows(
                IllegalInputException.class,
                () -> calculator.addTwoNumbers(number1, number2));
    }
}