package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    fun `should add`() {
        val calculator = Calculator();
        Assertions.assertEquals(4, calculator.add(2, 2), "2 + 2 should equal 4");
    }

}
