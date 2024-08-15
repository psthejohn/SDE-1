package com.dsa.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// Example array
		int[] arr = { 5, 2, 7, 3, 9, 1 };

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

			// If the index of the minimum element is different from the current index,
			// swap the elements at the current index and the index of the minimum element
			if (i != min_idx) {
				int temp = arr[i];
				arr[i] = arr[min_idx];
				arr[min_idx] = temp;
			}
		}
	}

}
