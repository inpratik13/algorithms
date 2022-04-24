/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.algorithm.dp.stringpattern;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PreceedingPatternMatchingTest {

    PreceedingPatternMatching matcher = new PreceedingPatternMatching();

    @Test
    public void test1() {
        assertTrue(matcher.isMatch("aaabaaaababcbccbaab", "c*c*.*c*a*..*c*"));
        System.out.println("\n\n");
    }

    @Test
    public void test2() {
        assertFalse(matcher.isMatch("a", "ab*a"));
        System.out.println("\n\n");
    }
}
