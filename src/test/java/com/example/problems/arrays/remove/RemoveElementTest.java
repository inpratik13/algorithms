/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.remove;

import org.junit.Test;

public class RemoveElementTest {

    private static final RemoveElement remover = new RemoveElement();
    
    @Test
    public void test() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int[] expectedNums = {2,2};

        int k = remover.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < expectedNums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
