package com.jgarfer.katas.sevenkyu.exesandohs;

public class ExesAndOhsChecker {

    public static boolean getXO(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = Character.toLowerCase(line.charAt(i));
            if (c == 'x') count += 1;
            else if (c == 'o') count -= 1;
        }
        return count == 0;
    }
}
