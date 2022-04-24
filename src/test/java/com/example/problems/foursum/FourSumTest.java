/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.foursum;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourSumTest {

    private static final FourSum summer = new FourSum();
    
    @Test
    public void test1() {
        int[] input = new int[] {0,0,0,0};
        String expected = "[[0, 0, 0, 0]]";
        
        List<List<Integer>> output = summer.fourSum(input, 0);
        assertEquals(expected, output.toString());
    }
}
