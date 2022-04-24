/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.sort.formbignumber;

import java.util.Arrays;
import java.util.Comparator;

public class StringComparatorSortToFormBigNumber implements SortToFormBigNumber {

    @Override
    public void sort(Integer[] input) {
        Comparator<Object> comparator = Comparator.comparing(String::valueOf).reversed();
        Arrays.sort(input, comparator);
    }

}
