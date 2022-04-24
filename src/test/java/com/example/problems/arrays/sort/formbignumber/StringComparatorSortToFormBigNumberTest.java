/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.sort.formbignumber;

import java.util.stream.IntStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringComparatorSortToFormBigNumberTest {

    private final SortToFormBigNumber algo = new StringComparatorSortToFormBigNumber();
    
    @Test
    public void test1() {
        Integer[] input = IntStream.of(0, 1, 2, 12).boxed().toArray(Integer[]::new);
        Integer[] output = IntStream.of(2, 12, 1, 0).boxed().toArray(Integer[]::new);
        
        algo.sort(input);
        assertEquals(output, input);
    }

    @Test
    public void test2() {
        Integer[] input = IntStream.of(0, 1, 2, 12, 9).boxed().toArray(Integer[]::new);
        Integer[] output = IntStream.of(9, 2, 12, 1, 0).boxed().toArray(Integer[]::new);

        algo.sort(input);
        assertEquals(output, input);
    }

}
