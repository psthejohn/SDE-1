package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a
 * Pyramid pattern, both made of stars. Example: For rows = 5, the output will A
 *
E 
D E 
C D E 
B C D E 
A B C D E 
 */
public class Pattern18 {

	public static void main(String[] args) {
		// Example usage of the pattern methods
		getPattern(5);
	}

	/**
	 * Method to print Pattern 18
	 * 
	 * @param rows The number of rows in the pattern
	 */
	public static void getPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (char ch=(char)(int)('A'+rows-i-1);ch<(char)(int)('A'+rows-1)+1; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
