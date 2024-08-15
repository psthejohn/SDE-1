package com.java.array;

//Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}
public class _0_Reverse_the_array {

	public static void main(String[] args) {
		int[] originalArr = { 1, 2, 3, 4, 5 };
		for (int i : reverseArrayExtraArray(originalArr)) {
			System.out.print(i + " ");
		}
	}

	private static int[] reverseArrayExtraArray(int[] arr) {
//		for (int i = 0; i < (arr.length / 2); i++) {
//			arr[i] = arr[i] ^ arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = arr[i] ^ arr[arr.length - i - 1];
//			arr[i] = arr[i] ^ arr[arr.length - i - 1];
//		}
		
		for(int i=0; i<(arr.length/2);i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return arr;
	}
}
