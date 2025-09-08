package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestCalc1 {
    private BMICalc calculator;

    @BeforeEach
    public void init() {
        calculator = new BMICalc();
    }

    @Test
    @DisplayName("[1] Test to see that BMI is calculated correctly")
    public void testShouldReturnCorrectBMI() {
        double height = 1.95;
        double weight = 80;

        double expected = 21.0;
        double actual = calculator.calculateBMI(height, weight);

        assertEquals(expected, actual);
    }
}
