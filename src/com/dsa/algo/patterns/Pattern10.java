package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a Pyramid pattern, both made of stars.
 * Example:
 * For rows = 5, the output will be:
*
**
***
****
*****
****
***
**
*
 */
public class Pattern10 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 10
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
        	for(int j =0; j<i+1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for (int i = 0; i < rows; i++) {
        	for(int j =0; j<rows-i-1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }
}

