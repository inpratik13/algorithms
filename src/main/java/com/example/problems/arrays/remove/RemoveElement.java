/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.remove;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        
        int i = 0;
        for(int n: nums)
            if(n != val)
                nums[i++] = n;
        
        return i;
    }
}
