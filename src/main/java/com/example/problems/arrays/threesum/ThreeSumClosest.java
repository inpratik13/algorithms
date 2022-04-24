/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.threesum;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestDiff = Integer.MAX_VALUE;
        
        //For each element in nums
        for(int i = 0 ; i + 2 < nums.length; i++) {
            int first = nums[i];
            int currentDiff = target - first - findClosestSumPair(nums, i + 1, target - first);
            
            if(Math.abs(closestDiff) > Math.abs(currentDiff)){
                closestDiff = currentDiff;
            }
        }
        
        return target - closestDiff;
    }
    
    private int findClosestSumPair(int[] nums, int leftIndex, int targetSum) {
        int rightIndex = nums.length - 1;
        int closestTarget = nums[leftIndex]+nums[rightIndex];
        
        do {
            int currentSum = nums[leftIndex]+nums[rightIndex];
            if(Math.abs(targetSum - closestTarget) > Math.abs(targetSum - currentSum)){
                closestTarget = currentSum;
            }
            
            if(targetSum > currentSum) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }while(leftIndex < rightIndex);
        
        return closestTarget;
    }
}
