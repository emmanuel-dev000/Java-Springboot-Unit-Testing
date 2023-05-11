package com.pangan.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void Test_1Plus2_ShouldEqual3()
    {
        var calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    void Test_1Plus2_ShouldNotEqual5()
    {
        var calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(5, result);
    }
}