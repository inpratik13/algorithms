/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.matrix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixRotationTest {
    private static final boolean print = false;
    private static final MatrixRotation rotator = new MatrixRotation();

    @Test
    public void test() {
        final int[][] input = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        final int[][] expected = { { 21, 16, 11, 6, 1 }, { 22, 17, 12, 7, 2 }, { 23, 18, 13, 8, 3 },
                { 24, 19, 14, 9, 4 }, { 25, 20, 15, 10, 5 } };

        if (print)
            Arrays.stream(input)
                    .map(Arrays::toString)
                    .forEach(System.out::println);

        rotator.rotate(input);

        if (print)
            Arrays.stream(input)
                    .map(Arrays::toString)
                    .forEach(System.out::println);

        List<String> output = Arrays.stream(input)
                .map(Arrays::toString)
                .collect(Collectors.toList());

        List<String> expectedOutput = Arrays.stream(expected)
                .map(Arrays::toString)
                .collect(Collectors.toList());

        assertEquals(expectedOutput, output);
    }
}
