/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
    private static final int PAIR_SIZE = 4;

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < PAIR_SIZE) {
            return Collections.emptyList();
        }

        Arrays.sort(nums);
        return kSum(nums, 0, 4, target);
    }

    private static List<List<Integer>> kSum(int[] nums, int startIndex, int k, int target) {
        List<List<Integer>> res = new LinkedList<>();
        // If no more element or if there can't be an element that will satisfy the
        // target
        if (startIndex == nums.length || nums[startIndex] > target / k) {
            return res;
        }

        if (k == 2) {
            return twoSum(nums, startIndex, target);
        }

        for (int i = startIndex; i + k - 1 < nums.length; i++) {
            int currentValue = nums[i];
            if (i != startIndex && currentValue == nums[i - 1])
                continue;

            kSum(nums, i + 1, k - 1, target - currentValue)
                    .forEach(list -> {
                        list.add(currentValue);
                        res.add(list);
                    });
        }

        return res;
    }

    private static List<List<Integer>> twoSum(int[] nums, int leftIndex, int targetSum) {
        int rightIndex = nums.length - 1;

        List<List<Integer>> res = new LinkedList<>();

        while (leftIndex < rightIndex) {
            int currentSum = nums[leftIndex] + nums[rightIndex];

            if (currentSum == targetSum) {
                res.add(asList(nums[leftIndex], nums[rightIndex])); // TODO: create method
            }

            if (currentSum > targetSum) {
                do {
                    rightIndex--;
                } while (leftIndex < rightIndex && nums[rightIndex] == nums[rightIndex + 1]);
            } else {
                do {
                    leftIndex++;
                } while (leftIndex < rightIndex && nums[leftIndex] == nums[leftIndex - 1]);
            }
        }

        return res;
    }

    private static List<Integer> asList(int... nums) {
        List<Integer> list = new ArrayList<>(PAIR_SIZE);
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }
}
