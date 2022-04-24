/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.waves;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignBasedWaveFormerTest {

    private final WaveFormer former = new SignBasedWaveFormer();

    @Test
    public void testEqualNumbers() {
        int[] input = new int[] { -4, 1, 2, 3, -1, -2, -3, -5, 4, 5 };
        int[] output = new int[] { -4, 1, -1, 2, -2, 3, -3, 4, -5, 5 };
        former.format(input);
        assertEquals(Arrays.toString(output), Arrays.toString(input));
    }

    @Test
    public void testMorePositive() {
        int[] input = new int[] { 9, -4, 1, 2, 3, 6, 7, -1, -2, -3, -5, 4, 5, 8 };
        int[] output = new int[] { -4, 9, -1, 1, -2, 2, -3, 3, -5, 6, 7, 4, 5, 8 };
        former.format(input);
        assertEquals(Arrays.toString(output), Arrays.toString(input));
    }

    @Test
    public void testMoreNegative() {
        int[] input = new int[] { -9, -4, 1, 2, 3, -6, -7, -1, -2, -3, -5, 4, 5, -8 };
        int[] output = new int[] { -9, 1, -4, 2, -6, 3, -7, 4, -1, 5, -2, -3, -5, -8 };
        former.format(input);
        assertEquals(Arrays.toString(output), Arrays.toString(input));
    }

}
