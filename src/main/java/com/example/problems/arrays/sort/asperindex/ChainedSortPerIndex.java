/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.sort.asperindex;

public class ChainedSortPerIndex implements SortPerIndex {

    @Override
    public void sort(int[] input, int[] indexes) {
        for (int i = 0; i < indexes.length; i++) {

            int expectedIndex = indexes[i];
            int expectedValue = input[i];
            
            while (expectedIndex != -1) {
                int nextValue = input[expectedIndex];
                int nextIndex = indexes[expectedIndex];

                input[expectedIndex] = expectedValue;
                indexes[expectedIndex] = -1;
                
                expectedValue = nextValue;
                expectedIndex = nextIndex;
            }
        }
    }

}
