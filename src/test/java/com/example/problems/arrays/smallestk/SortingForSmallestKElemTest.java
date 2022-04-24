/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.smallestk;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SortingForSmallestKElemTest {

    private static final SmallestKElem algo = new SortingForSmallestKElem();

    @Test
    public void testOrdered() {
        final int[] input = { 1, 2, 3, 4, 5, 6 };
        final int[] expected = { 1, 2, 3 };

        final int[] actual = algo.findSmallest(input, 3);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testUnordered() {
        final int[] input = { 4, 1, 5, 2, 6, 3 };
        final int[] expected = { 1, 2, 3 };

        final int[] actual = algo.findSmallest(input, 3);
        Arrays.sort(actual);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testInvalidK() {
        final int[] input = { 4, 1, 5, 2, 6, 3 };

        final int[] actual = algo.findSmallest(input, 7);
        assertNull(actual);
    }

    @Test
    public void testDuplicateNumbers() {
        final int[] input = { 1, 1, 1, 1, 2, 3 };
        final int[] expected = { 1, 1, 1 };

        final int[] actual = algo.findSmallest(input, 3);
        Arrays.sort(actual);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
