package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void should_add() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2), "2 + 2 should equal 4");
    }

}
