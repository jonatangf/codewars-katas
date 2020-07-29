package com.jgarfer.katas.sevenkyu.vowelcount;

public class VowelCounter {

    private static final String VOWELS = "aeiou";

    public static int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (VOWELS.contains(String.valueOf(str.charAt(i)).toLowerCase())) {
                count += 1;
            }
        }
        return count;
    }

}
