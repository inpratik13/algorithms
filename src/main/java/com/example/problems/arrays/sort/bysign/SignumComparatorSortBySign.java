/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.sort.bysign;

import java.util.Arrays;
import java.util.Comparator;

public class SignumComparatorSortBySign implements SortBySign {

    @Override
    public void sort(Integer[] input) {
        Comparator<Integer> comparator = Comparator.comparing(Integer::signum);
        Arrays.sort(input, comparator);
    }

}
