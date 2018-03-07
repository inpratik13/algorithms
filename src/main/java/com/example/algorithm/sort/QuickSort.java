package com.example.algorithm.sort;

/**
 * 
 * @author inpratik13
 *
 */
public class QuickSort extends Sort {

	public void sort(int[] input) {
		//System.out.printf("input: %s\n", Arrays.toString(input));
		sort(input, 0, input.length - 1);
		//System.out.printf("sorted output: %s\n\n", Arrays.toString(input));
	}

	private static void sort(int[] input, int left, int right) {
		if (right - left > 0) {
			int partition = partition(input, left, right, right);

			if (partition != -1) {
				//System.out.printf("will partition at %d[%d]\n", input[partition], partition);
				
				sort(input, left, partition - 1);
				sort(input, partition + 1, right);
			}
		}
	}

	private static int partition(int[] input, int left, int right, int pivot) {
		//System.out.printf("sorting from %d[%d] to %d[%d] with pivot %d[%d]\n", input[left], left, input[right], right, input[pivot], pivot);
		
		int pivotValue = input[pivot];
		--left;
		
		while (true) {
			while (left < pivot && input[++left] < pivotValue);
			while (right > left && input[--right] > pivotValue);

			//System.out.printf("current status: %s\n", Arrays.toString(input));
			if (left < right) {
				//System.out.printf("swapping items %d[%d] <-> %d[%d]\n", input[left], left, input[right], right);
				swap(input, left, right);
				
			} else if (left == right && left != pivot) {
				//System.out.printf("swapping pivot %d[%d] <-> %d[%d]\n", input[left], left, input[pivot], pivot);
				swap(input, left, pivot);
				break;
				
			} else {
				break;
			}
		}
		
		return left;
	}
	
}