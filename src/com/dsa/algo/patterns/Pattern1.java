package com.dsa.algo.patterns;

/**
 * This class prints a Square pattern made of stars.
 * Example:
 * For rows = 5, the output will be:
 * * * * * * 
 * * * * * * 
 * * * * * * 
 * * * * * * 
 * * * * * * 
 */
public class Pattern1 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 1: Right-angled Triangle
    public static void getPattern(int rows) {
    	for(int i=0; i<rows; i++) {
    		for(int j = 0; j< rows;j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
}
