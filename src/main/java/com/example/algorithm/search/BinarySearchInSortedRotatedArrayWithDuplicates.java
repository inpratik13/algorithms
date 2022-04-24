package com.example.algorithm.search;

public class BinarySearchInSortedRotatedArrayWithDuplicates implements Search {

    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private static int search(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[left] < nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < nums[right]) {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                int index = search(nums, left, mid - 1, target);
                if (index != -1)
                    return index;

                return search(nums, mid + 1, right, target);
            }
        }

        return -1;
    }

}
