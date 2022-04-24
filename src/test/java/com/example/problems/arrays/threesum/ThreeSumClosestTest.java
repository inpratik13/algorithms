/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.threesum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeSumClosestTest {
    ThreeSumClosest algo = new ThreeSumClosest();

    @Test
    public void test1() {
        int expected = 2;
        int actual = algo.threeSumClosest(
                new int[] { -1, 2, 1, -4 },
                1);
        
        assertEquals(expected, actual);
    }
}
