package com.jgarfer.katas.sevenkyu.highandlow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestAndLowestCalculatorTest {
    @Test
    public void test1() {
        assertEquals("42 -9", HighestAndLowestCalculator.calculate("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}