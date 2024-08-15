package com.dsa.algo.patterns;

/**
 * This class prints a Right-angled Triangle pattern made of stars.
 * Example:
 * For rows = 5, the output will be:
 * * 
 * * * 
 * * * * 
 * * * * * 
 * * * * * * 
 */
public class Pattern2 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 2: Right-angled Triangle with increasing number of stars per row
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
