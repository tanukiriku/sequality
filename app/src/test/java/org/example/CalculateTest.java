package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        assertEquals(5, calculate.sum(2,3));
    }

    @Test
    public void testAverage() {
        Calculate calculate = new Calculate();
        assertEquals(2.5, calculate.average(2, 3), 0.01);
    }

    @Test
    public void testSumBetween() {
        Calculate calculate = new Calculate();
        assertEquals(55, calculate.sumBetween(1, 10));
    }

    @Test
    public void testSumOddBetween() {
        Calculate calculate = new Calculate();
        assertEquals(25, calculate.sumOddBetween(1, 10));
    }

    @Test
    public void testSumEvenBetween() {
        Calculate calculate = new Calculate();
        assertEquals(30, calculate.sumEvenBetween(1, 10));
    }
}
