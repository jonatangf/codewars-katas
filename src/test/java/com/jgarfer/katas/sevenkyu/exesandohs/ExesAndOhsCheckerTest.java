package com.jgarfer.katas.sevenkyu.exesandohs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExesAndOhsCheckerTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testSomething1() {
        assertTrue(ExesAndOhsChecker.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertTrue(ExesAndOhsChecker.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertFalse(ExesAndOhsChecker.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertFalse(ExesAndOhsChecker.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertFalse(ExesAndOhsChecker.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertTrue(ExesAndOhsChecker.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertFalse(ExesAndOhsChecker.getXO("Xxxxertr34"));
    }
}