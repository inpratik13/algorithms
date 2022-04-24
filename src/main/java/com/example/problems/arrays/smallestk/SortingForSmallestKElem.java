/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.smallestk;

import java.util.Arrays;

public class SortingForSmallestKElem implements SmallestKElem {

    @Override
    public int[] findSmallest(int[] input, int k) {
        if(k > input.length) return null;
        
        Arrays.sort(input);
        return Arrays.copyOf(input, k);
    }

}
