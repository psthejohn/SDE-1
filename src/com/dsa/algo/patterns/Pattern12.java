package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a
 * Pyramid pattern, both made of stars. Example: For rows = 5, the output will
 * be:
 *  
 *  1        1
 *  12      21
 *  123    321
 *  1234  4321
 *  1234554321
 * 
 */
public class Pattern12 {

	public static void main(String[] args) {
		// Example usage of the pattern methods
		getPattern(5);
	}

	// Method to print Pattern 11
	public static void getPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(j + 1);
			}
			for (int j = i; j < rows * 2 - i-2; j++) {
				System.out.print(" ");
			}
			for (int j = i+1; j > 0; j--) {
				System.out.print(j );
			}
			System.out.println();
		}
	}
}
