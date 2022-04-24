/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.smallestk;

import java.util.Arrays;
import java.util.Random;

public class SelectionRankSmallestKElem implements SmallestKElem {

    @Override
    public int[] findSmallest(int[] input, int k) {
        if (input.length < k)
            return null;
        if (k == 0)
            return new int[0];

        int threashold = rank(input, 0, input.length - 1, k - 1);
        int[] smallest = new int[k];
        int count = 0;
        for (int a : input) {
            if (a <= threashold)
                smallest[count++] = a;

        }

        return smallest;
    }

    private static int rank(int[] input, final int start, final int end, final int rank) {
        final int pivot = input[random(start, end)];
        final int leftEnd = partition(input, start, end, pivot);

        int leftSize = leftEnd - start + 1;
        if (leftSize - 1 == rank) {
            return Arrays.stream(input, start, leftEnd + 1).max().getAsInt();
        }

        if (rank < leftSize) {
            return rank(input, start, leftEnd, rank);
        }

        return rank(input, leftEnd + 1, end, rank - leftSize);
    }

    private static int partition(int[] input, int left, int right, int pivot) {
        while (left <= right) {
            if (input[left] > pivot) {
                swap(input, left, right);
                right--;
            } else if (input[right] <= pivot) {
                swap(input, left, right);
                left++;
            } else {
                left++;
                right--;
            }
        }
        return left - 1;
    }

    private static void swap(int[] input, int left, int right) {
        int temp = input[left];
        input[left] = input[right];
        input[right] = temp;
    }

    private static int random(int left, int right) {
        Random random = new Random();
        return random.nextInt(right - left + 1) + left;
    }

}
