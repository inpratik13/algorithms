package com.example.algorithm.sort;

/**
 * Uses Binary Heap structure to store elements.<br/>
 * 
 * @author inpratik13
 *
 */
public class HeapSort implements Sort {

	public void sort(int[] input) {
		buildHeap(input);
		sortHeapAsArray(input);
	}

	private static void buildHeap(int[] heap) {
		for (int i = 0; i < heap.length; i++) {
			sortPathUpward(heap, i);
		}
	}

	private static void sortHeapAsArray(int[] heap) {
		for (int i = heap.length - 1; i > 0; i--) {
			swap(heap, 0, i);
			sortPathDownwards(heap, i - 1);
		}
	}

	private static void sortPathUpward(int[] heap, int leafIndex) {
		int parentIndex;
		while ((parentIndex = (leafIndex - 1) / 2) >= 0 && heap[parentIndex] < heap[leafIndex]) {
			swap(heap, parentIndex, leafIndex);
		}
	}

	private static void sortPathDownwards(int[] heap, int till) {
		int currentIndex = 0;
		int currentElement = heap[0];
		int leftChildIndex;

		while ((leftChildIndex = (2 * currentIndex) + 1) <= till) {
			int maxChildIndex = leftChildIndex;
			int maxChild = heap[maxChildIndex];

			if (leftChildIndex + 1 <= till && heap[leftChildIndex + 1] > maxChild) {
				maxChildIndex = leftChildIndex + 1;
				maxChild = heap[maxChildIndex];
			}

			if (maxChild > currentElement) {
				swap(heap, maxChildIndex, currentIndex);
				currentIndex = maxChildIndex;
			} else {
				break;
			}
		}
	}

	private static void swap(int[] heap, int index1, int index2) {
		int swap = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = swap;
	}
}