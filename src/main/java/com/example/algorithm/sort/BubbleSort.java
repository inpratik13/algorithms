package com.example.algorithm.sort;

/**
 * Bubble sort is a comparison-based algorithm.<br/>
 * In which each pair of adjacent elements is compared and the elements are
 * swapped if they are not in order.<br/>
 * This algorithm is not suitable for large data sets as its average and worst
 * case complexity are of O(n2) where n is the number of items.
 * 
 * @author inpratik13
 *
 */
public class BubbleSort implements Sort {

	public void sort(int[] input) {
		for (int loop = input.length - 1; loop > 0; loop--) {
			boolean swapped = false;

			for (int i = 0; i < loop; i++) {
				if (input[i] > input[i + 1]) {
					int temp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped)
				break;
		}

	}

}
