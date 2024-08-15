package com.dsa.algo.patterns;

/**
 * This class prints a Right-angled Triangle pattern with numbers increasing from 1 to the row number.
 * Example:
 * For rows = 5, the output will be:
 * 1 
 * 1 2 
 * 1 2 3 
 * 1 2 3 4 
 * 1 2 3 4 5 
 */
public class Pattern3 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 3: Right-angled Triangle with increasing numbers per row
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
