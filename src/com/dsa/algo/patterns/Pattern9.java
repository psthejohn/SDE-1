package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a Pyramid pattern, both made of stars.
 * Example:
 * For rows = 5, the output will be:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class Pattern9 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 9: Inverted Pyramid followed by Pyramid pattern with stars and spaces
    public static void getPattern(int rows) {
        // Printing Inverted Pyramid
        for (int i = 0; i < rows; i++) {
        	for(int j =rows; j>i;j--) {
        		System.out.print(" ");
        	}
        	for(int j=0; j<2*i+1; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        // Printing Pyramid
        for (int i = 0; i < rows; i++) {
        	for(int j =0; j<i+1;j++) {
        		System.out.print(" ");
        	}
        	for(int j=2*(rows-i)-1; j>0; j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}

