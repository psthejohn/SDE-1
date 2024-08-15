package com.dsa.algo.patterns;

/**
 * This class prints a pattern where each row contains consecutive numbers starting from 1.
 * Example:
 * For rows = 5, the output will be:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
public class Pattern13 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    /**
     * Method to print Pattern 13
     * @param rows The number of rows in the pattern
     */
    public static void getPattern(int rows) {
        for (int i = 0, num = 1; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
