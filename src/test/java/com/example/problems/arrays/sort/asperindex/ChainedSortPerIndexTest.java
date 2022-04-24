/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.sort.asperindex;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainedSortPerIndexTest {

    private final SortPerIndex algo = new ChainedSortPerIndex();

    @Test
    public void test1() {
        int[] input = new int[] { 10, 12, 11 };
        int[] indexes = new int[] { 1, 0, 2 };
        int[] output = new int[] { 12, 10, 11 };

        algo.sort(input, indexes);
        assertEquals(Arrays.toString(output), Arrays.toString(input));
    }

    @Test
    public void test2() {
        int[] input = new int[] { 0, 3, 6, 4, 2, 5, 1 };
        int[] indexes = new int[] { 0, 3, 6, 4, 2, 5, 1 };
        int[] output = new int[] { 0, 1, 2, 3, 4, 5, 6 };

        algo.sort(input, indexes);
        assertEquals(Arrays.toString(output), Arrays.toString(input));
    }

}
