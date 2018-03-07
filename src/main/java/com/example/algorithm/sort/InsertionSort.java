package com.example.algorithm.sort;

/**
 * In insertion sort, each element on left of current element is shifted right
 * until an element smaller than current one is found.<br/>
 * Then current element is shifted on right place to small element found. This
 * is repeated taking each element as current starting from second element to
 * last one.<br/>
 * All the elements on left to current element are always sorted.
 * 
 * @author inpratik13
 *
 */
public class InsertionSort extends Sort {

	public void sort(int[] input) {
		int current;
		int j;

		for (int i = 1; i < input.length; i++) {
			current = input[i];

			for (j = i - 1; j >= 0 && input[j] > current; j--) {
				input[j + 1] = input[j];
			}

			input[j + 1] = current;
		}

	}

}
