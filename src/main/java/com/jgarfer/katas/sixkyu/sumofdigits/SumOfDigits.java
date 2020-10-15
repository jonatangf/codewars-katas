package com.jgarfer.katas.sixkyu.sumofdigits;

public class SumOfDigits {

    public static int digital_root(int i) {
        if (i < 10) return i;
        return digital_root(sum(i));
    }

    public static int sum(int number) {
        int result = 0;
        String stringNumber = String.valueOf(number);
        for (int i = 0; i < stringNumber.length(); i++) {
            result += Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }
        return result;
    }
}
