package com.jgarfer.katas.sevenkyu.consecutivesum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveSumCalculatorTest {

    @Test
    public void of1() {
        assertEquals(1, ConsecutiveSumCalculator.consecutiveSum(1));
    }

    @Test
    public void of2() {
        assertEquals(1, ConsecutiveSumCalculator.consecutiveSum(2));
    }

    @Test
    public void of3() {
        assertEquals(2, ConsecutiveSumCalculator.consecutiveSum(3));
    }

    @Test
    public void of15() {
        assertEquals(4, ConsecutiveSumCalculator.consecutiveSum(15));
    }

    @Test
    public void of48() {
        assertEquals(2, ConsecutiveSumCalculator.consecutiveSum(48));
    }

    @Test
    public void of97() {
        assertEquals(2, ConsecutiveSumCalculator.consecutiveSum(97));
    }

    @Test
    public void of250() {
        assertEquals(4, ConsecutiveSumCalculator.consecutiveSum(250));
    }

    @Test
    public void of2500() {
        assertEquals(5, ConsecutiveSumCalculator.consecutiveSum(2500));
    }

    @Test
    public void of25000() {
        assertEquals(6, ConsecutiveSumCalculator.consecutiveSum(25000));
    }

    @Test
    public void of250000() {
        assertEquals(7, ConsecutiveSumCalculator.consecutiveSum(250000));
    }

    @Test
    public void of2500000() {
        assertEquals(8, ConsecutiveSumCalculator.consecutiveSum(2500000));
    }
}