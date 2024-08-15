package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a
 * Pyramid pattern, both made of stars. Example: For rows = 5, the output will
A 
B B 
C C C 
D D D D 
E E E E E 
 */
public class Pattern16 {

	public static void main(String[] args) {
		// Example usage of the pattern methods
		getPattern(5);
	}

	/**
	 * Method to print Pattern 16
	 * 
	 * @param rows The number of rows in the pattern
	 */
	public static void getPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j<i+1;j++) {
				System.out.print((char)(int)('A'+i)+ " ");
			}
			System.out.println();
		}
	}
}
