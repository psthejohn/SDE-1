package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a
 * Pyramid pattern, both made of stars. Example: For rows = 5, the output will A

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
 
 */
public class Pattern19 {

	public static void main(String[] args) {
		// Example usage of the pattern methods
		getPattern(5);
	}

	/**
	 * Method to print Pattern 19
	 * 
	 * @param rows The number of rows in the pattern
	 */
	public static void getPattern(int rows) {
		// Printing the top half of the pattern
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * (rows - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			// Move to the next line after each row
			System.out.println();
		}

		for (int i = 0; i < rows + 1; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < rows - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
