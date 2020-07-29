package com.jgarfer.katas.sixkyu.multiplesof5or3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOf5Or3CalculatorTest {

    @Test
    public void test() {
        assertEquals(23, new MultiplesOf5Or3Calculator().calculate(10));
    }
}