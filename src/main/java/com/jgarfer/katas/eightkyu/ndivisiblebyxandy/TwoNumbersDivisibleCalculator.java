package com.jgarfer.katas.eightkyu.ndivisiblebyxandy;

public class TwoNumbersDivisibleCalculator {

    public static boolean isDivisible(int n, int x, int y) {
        return n % x == 0 && n % y == 0;
    }
}