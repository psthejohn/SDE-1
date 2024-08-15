package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a
 * Pyramid pattern, both made of stars. Example: For rows = 5, the output will A
 *    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
 */
public class Pattern17 {

	public static void main(String[] args) {
		// Example usage of the pattern methods
		getPattern(5);
	}

	/**
	 * Method to print Pattern 17
	 * 
	 * @param rows The number of rows in the pattern
	 */
	public static void getPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print((char) (int) ('A' + j));
			}
			for(int j=0;j<i;j++) {
				System.out.print((char)(int)('A'+i-j-1));
			}
			System.out.println();
		}
	}
}
