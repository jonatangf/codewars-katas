package com.jgarfer.katas.sixkyu.wholikesit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhoLikesItTest {

    @Test
    public void test1() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
    }

    @Test
    public void test2() {
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
    }

    @Test
    public void test3() {
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
    }

    @Test
    public void test4() {
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
    }

    @Test
    public void test5() {
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}