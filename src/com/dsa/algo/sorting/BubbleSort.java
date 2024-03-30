package com.dsa.algo.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        // Example array to be sorted
        int[] arr = {5, 2, 7, 3, 9, 1};

        // Call the bubbleSort method to sort the array
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Method to perform Bubble Sort on the given array
    public static void bubbleSort(int[] arr) {
        // Outer loop for iterating through each element of the array
        for(int i = 0; i < arr.length - 1; i++) {
            // Inner loop for comparing and swapping adjacent elements
            for(int j = i + 1; j < arr.length; j++) {
                // Check if the current element is greater than the next element
                if(arr[i] > arr[j]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
