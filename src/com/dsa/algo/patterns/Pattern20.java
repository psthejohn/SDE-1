package com.dsa.algo.patterns;

/**
 * This class prints a pattern consisting of an Inverted Pyramid followed by a
 * Pyramid pattern, both made of stars. Example: For rows = 5, the output will A
 * 
**********
****  ****
***    ***
**      **
*        *
          
*        *
**      **
***    ***
****  ****
**********
 * 
 */
public class Pattern20 {

    public static void main(String[] args) {
        // Example usage of the pattern methods
        getPattern(5);
    }

    /**
     * Method to print Pattern 20
     * 
     * @param rows The number of rows in the pattern
     */
    public static void getPattern(int rows) {
        // Printing the top half of the pattern
        for (int i = 0; i < rows; i++) {
            // Print stars for left side of the pattern
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }
            // Print spaces for the gap
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            // Print stars for right side of the pattern
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Printing the bottom half of the pattern
        for (int i = 0; i < rows+1; i++) {
            // Print stars for left side of the pattern
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Print spaces for the gap
            for (int j = 0; j < (rows - i) * 2; j++) {
                System.out.print(" ");
            }
            // Print stars for right side of the pattern
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
