package com.jgarfer.katas.sixkyu.splitstrings;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringSplitterTest {

    private StringSplitter stringSplitter;

    @Before
    public void setUp() {
        stringSplitter = new StringSplitter();
    }

    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(stringSplitter.splitBy2(s)));
        assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(stringSplitter.splitBy2(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(stringSplitter.splitBy2(s)));
        assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(stringSplitter.splitBy2(s1)));
    }
}