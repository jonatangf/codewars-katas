package com.jgarfer.katas.sevenkyu.vowelcount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, VowelCounter.getCount("abracadabra"));
    }
}