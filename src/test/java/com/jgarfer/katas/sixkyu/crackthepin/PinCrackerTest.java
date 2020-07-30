package com.jgarfer.katas.sixkyu.crackthepin;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class PinCrackerTest {

    private PinCracker pinCracker;

    @Before
    public void setUp() {
        pinCracker = new PinCracker();
    }

    @Test
    public void simple_test() {
        try {
            assertEquals("Should work with simple PIN", "12345", pinCracker.crack("827ccb0eea8a706c4c34a16891f84e7b"));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void harder_test() {
        try {
            assertEquals("Should work with harder PIN", "00078", pinCracker.crack("86aa400b65433b608a9db30070ec60cd"));
        } catch (Exception e) {
            fail();
        }
    }
}