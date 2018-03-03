package com.example.algorithm.search;

public interface Search {
	/**
	 * Function should check that element exist in provided input of array or not.</br>
	 * Return index of element or -1.
	 * 
	 * @param input To find in
	 * @param element To find
	 * @return Index of element, if found otherwise -1.
	 */
	public int search(int[] input, int element);
}
