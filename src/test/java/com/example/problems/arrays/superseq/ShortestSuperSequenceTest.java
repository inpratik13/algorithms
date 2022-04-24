/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.superseq;

import com.example.problems.arrays.superseq.ShortestSuperSequence.Range;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestSuperSequenceTest {

    private static final ShortestSuperSequence algo = new ShortestSuperSequence();

    @Test
    public void test() {
        final int[] input = { 7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7 };
        final int[] elem = { 1, 5, 9 };

        final Range actual = algo.find(input, elem);
        final Range expected = new Range(7, 10);

        assertEquals(expected.toString(), actual.toString());
    }
}
