package com.dsa.algo.patterns;

/**
 * This class prints a Pyramid pattern made of stars.
 * Example:
 * For rows = 5, the output will be:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Pattern7 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    // Method to print Pattern 7: Pyramid pattern with spaces and stars
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
