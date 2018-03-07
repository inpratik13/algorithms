package com.example.algorithm.sort;

import java.util.Arrays;

/**
 * Divide input in halves recursively, sort each halves,<br/>
 * and join them by sorting elements of each halves.
 * 
 * @author inpratik13
 *
 */
public class MergeSort extends Sort {

	public void sort(int[] input) {
		if (input.length < 2) {
			return;
		}

		int mid = (input.length - 1) / 2;
		int[] firstHalf = Arrays.copyOfRange(input, 0, mid + 1);
		int[] secondHalf = Arrays.copyOfRange(input, mid + 1, input.length);

		sort(firstHalf);
		sort(secondHalf);

		int fi = 0, si = 0, opIndex = 0;
		while (fi < firstHalf.length && si < secondHalf.length) {
			if (firstHalf[fi] < secondHalf[si]) {
				input[opIndex] = firstHalf[fi];
				fi++;
			} else {
				input[opIndex] = secondHalf[si];
				si++;
			}

			opIndex++;
		}

		while (fi < firstHalf.length) {
			input[opIndex] = firstHalf[fi];
			fi++;
			opIndex++;
		}

		while (si < secondHalf.length) {
			input[opIndex] = secondHalf[si];
			si++;
			opIndex++;
		}
	}

}