package com.example.algorithm.search;

/**
 * Binary search is a fast search algorithm with run-time complexity of Ο(log
 * n).<br/>
 * This search algorithm works on the principle of divide and conquer.<br/>
 * For this algorithm to work properly, <b>the input data must be in a sorted
 * form</b>.
 * 
 * @author inpratik13
 *
 */
public class BinarySearch implements Search{

	/**
	 * @param input
	 *            To find in
	 * @param element
	 *            To find
	 * @return Index of element, if found otherwise -1.
	 */
	public int search(int[] input, int element) {
		int lowerBound = 0;
		int upperBound = input.length;
		int midPoint = -1;
		int index = -1;

		while (lowerBound <= upperBound) {
			midPoint = (lowerBound + upperBound) / 2;
			
			if(midPoint == input.length) {
				break;
			}
			
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
