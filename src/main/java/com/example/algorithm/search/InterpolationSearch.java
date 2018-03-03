package com.example.algorithm.search;

/**
 * Interpolation search is an improved variant of binary search.<Br/>
 * This search algorithm works on the probing position of the required
 * value.<Br/>
 * For this algorithm to work properly, the data collection should be in a
 * sorted form and equally distributed.
 * 
 * @author inpratik13
 *
 */
public class InterpolationSearch implements Search {

	/**
	 * @param input
	 *            To find in
	 * @param element
	 *            To find
	 * @return Index of element, if found otherwise -1.
	 */
	public int search(int[] input, int element) {
		int lowerBound = 0;
		int upperBound = input.length - 1;
		int midPoint = -1;
		int index = -1;

		while (lowerBound <= upperBound) {
			midPoint = ((upperBound - lowerBound) * (element - input[lowerBound]))
					/ (input[upperBound] - input[lowerBound]);

			if (midPoint < lowerBound || midPoint > upperBound)
				break;

			if (input[midPoint] == element) {
				index = midPoint;
				break;
			} else if (input[midPoint] > element) {
				upperBound = midPoint - 1;
			} else {
				lowerBound = midPoint + 1;
			}
		}

		return index;
	}

}
