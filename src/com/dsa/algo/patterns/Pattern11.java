package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a Pyramid pattern, both made of stars.
 * Example:
 * For rows = 5, the output will be:
1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 

 */
public class Pattern11 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

 // Method to print Pattern 10
    public static void getPattern(int rows) {
    	boolean x = true;
        for (int i = 0; i < rows; i++) {
        	for(int j =0; j<i+1;j++) {
        		System.out.print(x ? "1 " : "0 ");
        		x = !x;
        	}
        	System.out.println();
        }
    }
}

