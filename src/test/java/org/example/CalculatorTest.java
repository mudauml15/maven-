package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2, 1));
    }
}