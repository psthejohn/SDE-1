package com.dsa.algo.patterns;

/**
 * This class prints an Inverted Pyramid pattern made of stars.
 * Example:
 * For rows = 5, the output will be:
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class Pattern8 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 8: Inverted Pyramid pattern with spaces and stars
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = (rows - i) * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
