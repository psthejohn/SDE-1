package com.dsa.algo.sorting;

public class SelectionSort_STABLE {

	public static void main(String[] args) {
		// Example array
		int[] arr = { 5, 2, 7, 3,3, 9, 1 };

		// Call the selectionSort method to sort the array
		selectionSort(arr);

		// Print the sorted array
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	// Method to perform Selection Sort
	static void selectionSort(int[] arr) {
		// Iterate through the array
		for (int i = 0; i < arr.length - 1; i++) {
			// Assume the current index as the index of the minimum element
			int min_idx = i;
			// Find the index of the minimum element in the unsorted portion of the array
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx])
					min_idx = j;
			}
			int element = arr[min_idx];
			System.out.print("Iteration :: "+i+" min_idx :: "+min_idx+" element :: "+element+"   ");
			while(min_idx>i) {
				// If element is found at index 2 and i is 1.
				// We will assign arr[2] = arr[1]
				arr[min_idx] =arr[min_idx-1];
				min_idx--;
			}
			arr[i] = element;
			for(int a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
