package com.dsa.algo.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        // Example array to be sorted
        int[] arr = { 5, 2, 7, 3, 9, 1 };

        // Sorting the array using insertion sort
        insertionSort(arr);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Method to perform insertion Sort on the given array
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Iterate through the array starting from index 1
            for (int j = i; j > 0; j--) {
                // Compare the current element with its previous elements and swap if necessary
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    // If the current element is greater than or equal to the previous element,
                    // no more swaps are needed as the array is already sorted up to this point
                    break;
                }
            }
        }
    }
}
