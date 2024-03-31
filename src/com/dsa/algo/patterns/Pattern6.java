package com.dsa.algo.patterns;

/**
 * This class prints a Right-angled Triangle pattern with numbers decreasing from row number to 1.
 * Example:
 * For rows = 5, the output will be:
 * 1 2 3 4 5 
 * 1 2 3 4 
 * 1 2 3 
 * 1 2 
 * 1 
 */
public class Pattern6 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 6: Right-angled Triangle with decreasing numbers per row
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(rows - j + 1 + " ");
            }
            System.out.println();
        }
    }
}
