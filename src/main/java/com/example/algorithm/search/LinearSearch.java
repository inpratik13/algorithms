package com.example.algorithm.search;
/**
 * Linear search is a very simple search algorithm.</br>
 * In this type of search, a sequential search is made over all items one by one.</br>
 * Every item is checked and if a match is found then index of that item is returned, </br>
 * if any match is not found then it returns -1.
 * 
 * @author KRPurohit
 *
 */
public class LinearSearch {

	/**
	 * Function will check that element exist in provided input of array or not.</br>
	 * Return index of element or -1.
	 * 
	 * @param input To find in
	 * @param element To find
	 * @return Index of element, if found otherwise -1.
	 */
	public int search(int[] input, int element) {

		for (int i = 0; i < input.length; i++) {
			if (input[i] == element) {
				return i;
			}
		}

		return -1;

	}

}
