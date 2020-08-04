package com.jgarfer.katas.sixkyu.splitstrings;

import java.util.ArrayList;
import java.util.List;

public class StringSplitter {

    public String[] splitBy2(String s) {
        List<String> strings = new ArrayList<>();
        StringBuilder couple = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            couple.append(s.charAt(i));
            if (i % 2 != 0) {
                String letters = couple.toString();
                couple.replace(0, letters.length(), "");
                strings.add(letters);
            }
        }
        if (couple.length() > 0) {
            couple.append("_");
            strings.add(couple.toString());
        }
        return strings.toArray(new String[0]);
    }
}