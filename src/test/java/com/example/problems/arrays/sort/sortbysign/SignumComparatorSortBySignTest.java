/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.sort.sortbysign;

import com.example.problems.arrays.sort.bysign.SignumComparatorSortBySign;
import com.example.problems.arrays.sort.bysign.SortBySign;

import java.util.stream.IntStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignumComparatorSortBySignTest {

    private final SortBySign algo = new SignumComparatorSortBySign();

    @Test
    public void test1() {
        Integer[] input = IntStream.of(1, -1, -2, 2, 3, -3).boxed().toArray(Integer[]::new);
        Integer[] output = IntStream.of(-1, -2, -3, 1, 2, 3).boxed().toArray(Integer[]::new);

        algo.sort(input);
        assertEquals(output, input);
    }

    @Test
    public void test2() {
        Integer[] input = IntStream.of(1, -1, -2, 2, 3, -3, 4, 5, -5, -4).boxed().toArray(Integer[]::new);
        Integer[] output = IntStream.of(-1, -2, -3, -5, -4, 1, 2, 3, 4, 5).boxed().toArray(Integer[]::new);

        algo.sort(input);
        assertEquals(output, input);
    }

}
