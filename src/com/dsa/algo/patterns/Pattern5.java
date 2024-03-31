package com.dsa.algo.patterns;

/**
 * This class prints a Right-angled Triangle pattern with stars decreasing from right to left.
 * Example:
 * For rows = 5, the output will be:
 * * * * * * 
 * * * * * 
 * * * * 
 * * * 
 * * 
 */
public class Pattern5 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 5: Right-angled Triangle with decreasing stars per row
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
