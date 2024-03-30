package com.dsa.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 7, 3, 9, 1 }; // Example array
		selectionSort(arr);
		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_idx])
					min_idx = j;
			}
			if (i != min_idx) {
				int temp = arr[i];
				arr[i] = arr[min_idx];
				arr[min_idx] = temp;
			}
		}
	}

}
