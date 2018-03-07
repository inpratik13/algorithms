package com.example.algorithm.sort;

public abstract class Sort {
	/**
	 * Function should sort all elements in {@code input}.
	 * 
	 * @param input
	 *            To sort
	 */
	public abstract void sort(int[] input);
	
	protected static void swap(int[] heap, int index1, int index2) {
		int swap = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = swap;
	}
}
