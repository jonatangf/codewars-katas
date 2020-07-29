package com.jgarfer.katas.eightkyu.ndivisiblebyxandy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoNumbersDivisibleCalculatorTest {

    @Test
    public void test1() {
        assertTrue(TwoNumbersDivisibleCalculator.isDivisible(12, 4, 3));
    }

    @Test
    public void test2() {
        assertFalse(TwoNumbersDivisibleCalculator.isDivisible(3, 3, 4));
    }

    @Test
    public void of6_is2_3() {
        assertTrue(TwoNumbersDivisibleCalculator.isDivisible(6, 2, 3));
    }

    @Test
    public void of6_is_3_6() {
        assertTrue(TwoNumbersDivisibleCalculator.isDivisible(6, 3, 6));
    }
}