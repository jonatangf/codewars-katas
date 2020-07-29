package com.jgarfer.katas.sevenkyu.simplearrayproduct;

import java.util.Arrays;

public class SimpleArrayProductCalculator {
    public static int solve(int[][] matrix) {
        int result = 1;
        for (int[] row : matrix) {
            int biggerElement = Arrays
                    .stream(row)
                    .reduce(
                            Integer.MIN_VALUE,
                            (bigger, element) -> Math.abs(element) > Math.abs(bigger) ? Math.abs(element) : bigger);
            result *= biggerElement;
        }
        return result;
    }
}
