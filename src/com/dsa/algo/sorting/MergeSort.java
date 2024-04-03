package com.dsa.algo.sorting;

import java.util.Arrays;

/**
 * This class implements the Merge Sort algorithm to sort an array of integers.
 */
public class MergeSort {

    public static void main(String[] args) {
        // Example array to be sorted
        int[] arr = {5, 2, 7, 3, 9, 1};
        int Ub = arr.length - 1;
        merge(arr, 0, Ub);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    /**
     * Recursive method to divide the array into sub-arrays and merge them.
     *
     * @param arr The array to be sorted
     * @param lb  The lower bound index of the sub-array
     * @param ub  The upper bound index of the sub-array
     */
    private static void merge(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (ub + lb) / 2;
            merge(arr, lb, mid);
            merge(arr, mid + 1, ub);
            conquer(arr, mid, lb, ub);
        } else {
            return;
        }
    }

    /**
     * Merges two sorted sub-arrays into one sorted array.
     *
     * @param arr The array containing the sub-arrays to be merged
     * @param mid The middle index separating the sub-arrays
     * @param lb  The lower bound index of the first sub-array
     * @param ub  The upper bound index of the second sub-array
     */
    private static void conquer(int[] arr, int mid, int lb, int ub) {
        int[] b = new int[arr.length]; // Temporary array to store the merged elements
        int i = lb;
        int j = mid + 1;
        int k = lb;
        // Merge the two sub-arrays by comparing elements
        while (i <= mid && j <= ub) {
            if (arr[i] < arr[j]) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }
        }
        // Copy any remaining elements from the first sub-array
        if (i > mid) {
            while (j <= ub) {
                b[k++] = arr[j++];
            }
        } else {
            // Copy any remaining elements from the second sub-array
            while (i <= mid) {
                b[k++] = arr[i++];
            }
        }
        // Copy the merged elements from the temporary array back to the original array
        System.arraycopy(b, lb, arr, lb, ub - lb + 1);
    }
}
