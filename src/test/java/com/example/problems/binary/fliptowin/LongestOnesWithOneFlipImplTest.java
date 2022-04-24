/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.binary.fliptowin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestOnesWithOneFlipImplTest {

    LongestOnesWithOneFlip impl = new LongestOnesWithOneFlipImpl();

    @Test
    public void test1() {
        int input = 1775;
        int actual = impl.find(input);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int input = 5;
        int actual = impl.find(input);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int input = Integer.valueOf("110111001111", 2);
        int actual = impl.find(input);
        int expected = 6;

        assertEquals(expected, actual);
    }
}
