package com.jgarfer.katas.sevenkyu.simplearrayproduct;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleArrayProductCalculatorTest {
    @Test
    public void basicTests() {
        assertEquals(8, SimpleArrayProductCalculator.solve(new int[][]{{1, 2}, {3, 4}}));
        assertEquals(45, SimpleArrayProductCalculator.solve(new int[][]{{10, -15}, {-1, -3}}));
        assertEquals(12, SimpleArrayProductCalculator.solve(new int[][]{{-1, 2, -3, 4}, {1, -2, 3, -4}}));
        assertEquals(17600, SimpleArrayProductCalculator.solve(new int[][]{{-11, -6}, {-20, -20}, {18, -4}, {-20, 1}}));
        assertEquals(3584, SimpleArrayProductCalculator.solve(new int[][]{{14, 2}, {0, -16}, {-12, -16}}));
        assertEquals(12, SimpleArrayProductCalculator.solve(new int[][]{{-3, -4}, {1, 2, -3}}));
        assertEquals(-40, SimpleArrayProductCalculator.solve(new int[][]{{-2, -15, -12, -8, -16}, {-4, -15, -7}, {-10, -5}}));
    }
}