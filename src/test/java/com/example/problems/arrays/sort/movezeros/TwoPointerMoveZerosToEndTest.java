/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.sort.movezeros;

import com.example.problems.arrays.sort.movezeros.MoveZerosToEnd;
import com.example.problems.arrays.sort.movezeros.TwoPointerMoveZerosToEnd;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoPointerMoveZerosToEndTest {

    private final MoveZerosToEnd algo = new TwoPointerMoveZerosToEnd();

    @Test
    public void test() {
        int[] input = new int[] { 0, 1, 2, 3, 0, 4, 0, 5, 0, 6, 0, 0 };
        int[] output = new int[] { 6, 1, 2, 3, 5, 4, 0, 0, 0, 0, 0, 0 };
        algo.move(input);

        assertEquals(Arrays.toString(output), Arrays.toString(input));
    }
}
