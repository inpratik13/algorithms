/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.sort.movezeros;

public class TwoPointerMoveZerosToEnd implements MoveZerosToEnd {

    @Override
    public void move(int[] input) {
        int left = 0, right = input.length - 1;
        while (left < right) {
            while (left < right && input[left] != 0) {
                left++;
            }
            while (left < right && input[right] == 0) {
                right--;
            }
            if (left < right) {
                int temp = input[left];
                input[left++] = input[right];
                input[right--] = temp;
            }
        }
    }

}
