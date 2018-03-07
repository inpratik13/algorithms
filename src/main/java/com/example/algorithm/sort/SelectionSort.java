package com.example.algorithm.sort;

/**
 * Selection sort finds smallest element from data and moves it to left most
 * position.<br/>
 * So left part always remains sorted.<br/>
 * Same steps are repeated for remaining unsorted part of data.
 * 
 * @author inpratik13
 *
 */
public class SelectionSort extends Sort {

	public void sort(int[] input) {

		for (int loop = 0; loop < input.length; loop++) {

			int minElem = input[loop];
			int minElemIndex = loop;

			for (int i = loop + 1; i < input.length; i++) {
				if (minElem > input[i]) {
					minElem = input[i];
					minElemIndex = i;
				}
			}

			if (minElemIndex != loop) {
				input[minElemIndex] = input[loop];
				input[loop] = minElem;
			}

		}
	}

}
