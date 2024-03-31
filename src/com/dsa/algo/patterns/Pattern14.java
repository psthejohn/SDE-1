package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a Pyramid pattern,
 * both made of stars.
 * Example:
 * For rows = 5, the output will be:
 *  A 
 *  A B 
 *  A B C 
 *  A B C D 
 *  A B C D E 
 */
public class Pattern14 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    /**
     * Method to print Pattern 14: Inverted Pyramid followed by Pyramid pattern with alphabets.
     * @param rows The number of rows in the pattern
     */
    public static void getPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (char ch = 'A'; ch < 'A' + i + 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
