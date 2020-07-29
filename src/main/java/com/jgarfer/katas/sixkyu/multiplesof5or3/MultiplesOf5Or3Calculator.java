package com.jgarfer.katas.sixkyu.multiplesof5or3;

public class MultiplesOf5Or3Calculator {

    public int calculate(int number) {
        int result = 0;
        for (int i = 3; i < number; i++) {
            result += i % 3 == 0 || i % 5 == 0 ? i : 0;
        }
        return result;
    }
}
