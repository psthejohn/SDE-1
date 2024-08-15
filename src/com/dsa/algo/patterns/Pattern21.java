package com.dsa.algo.patterns;

/**
 * This class prints a Right-angled Triangle pattern made of stars. Example: For
 * rows = 5, the output will be:
*****
*   *
*   *
*   *
*****
 */
public class Pattern21 {

	public static void main(String[] args) {
		// Example usage of the pattern methods
		getPattern(8);
	}

	// Method to print Pattern 21
	public static void getPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				//	When to print '*'				
				if(i==0 || i==rows-1 || j==0 || j ==rows-1) {
					System.out.print("*");
				}
				//	When to print 'Space'
				else if(i>0 && i<rows-1 && j>0 && j<rows-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
