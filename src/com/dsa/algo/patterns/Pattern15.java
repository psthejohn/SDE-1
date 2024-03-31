package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a
 * Pyramid pattern, both made of stars. Example: For rows = 5, the output will
 * be: 
A B C D E 
A B C D 
A B C 
A B 
A 

 */
public class Pattern15 {

	public static void main(String[] args) {
		// Example usage of the pattern methods
		getPattern(5);
	}

	/**
	 * Method to print Pattern 15
	 * 
	 * @param rows The number of rows in the pattern
	 */
	public static void getPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (char ch = 'A'; ch < 'A' + (rows - i); ch++) {
				System.out.print(ch+ " ");
			}
			System.out.println();
		}
	}
}
