package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntsCalculatorTest {
    Ints intsCalc = new IntsCalculator();

    @Test
    void sum() {
        int testSum = intsCalc.sum(2, 5);
        Assertions.assertEquals(7, testSum);
    }

    @Test
    void mult() {
        int testMult = intsCalc.mult(3, 10);
        Assertions.assertEquals(30, testMult);
    }

    @Test
    void pow() {
        int testPow = intsCalc.pow(3, 3);
        Assertions.assertEquals(27, testPow);
    }
}