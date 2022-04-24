/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.algorithm.dp.stringpattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WildCardPatternMatchingTest {
    private static final WildCardPatternMatching matcher = new WildCardPatternMatching();
    
    @Test
    public void test() {
        boolean actual = matcher.isMatch("acdcb", "a*c?b");
        boolean expected = false;
        
        assertEquals(expected, actual);
    }
}
