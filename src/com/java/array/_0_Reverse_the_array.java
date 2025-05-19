package com.java.Array;

//Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}
public class _0_Reverse_the_array {

	public static void main(String[] args) {
		int[] originalArr = { 1, 2, 3, 4, 5 };
		for (int i : bruteForce(originalArr)) {
			System.out.print(i + " ");
		}
		for (int i : optimized(originalArr)) {
			System.out.print(i + " ");
		}
	}
	private static int[] bruteForce(int[] arr){
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1; j<arr.length;j++){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
	private static int[] optimized(int[] arr){
		int ptr1=0, ptr2=arr.length-1;
		while(ptr1<ptr2){
			int temp = arr[ptr1];
			arr[ptr1++] = arr[ptr2];
			arr[ptr2--] = temp;
		}
		return arr;
	}
}