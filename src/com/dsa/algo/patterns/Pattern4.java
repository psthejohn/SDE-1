package com.dsa.algo.patterns;

/**
 * This class prints a Right-angled Triangle pattern with each row containing the row number repeated.
 * Example:
 * For rows = 5, the output will be:
 * 1 
 * 2 2 
 * 3 3 3 
 * 4 4 4 4 
 * 5 5 5 5 5 
 */
public class Pattern4 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 4: Right-angled Triangle with repeated row numbers per row
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }
}
