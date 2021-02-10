package com.pharmapartners.agenda.models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class CalculatorTest {

    @Test
    void addTwoNumbers() {
        Calculator calculator = new Calculator();
        double number1 = 15;
        double number2 = 7;


        double actualAnswer = calculator.addTwoNumbers(number1, number2);
        double expectedAnswer = 22;

        assertEquals(expectedAnswer, actualAnswer);
    }

}
