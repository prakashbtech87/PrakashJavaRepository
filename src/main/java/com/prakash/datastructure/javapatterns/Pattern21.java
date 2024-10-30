package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 *
 * This class generates a specific pattern of stars.
 * The pattern consists of a hollow square of stars.
 */
public class Pattern21 {

    public static void main(String[] args) {
        // Call the method to print the pattern with 5 rows
        printPattern1(5);
    }

    /**
     * This method prints a hollow square pattern based on the given number of rows.
     *
     * @param n the number of rows and columns for the pattern
     */
    public static void printPattern1(int n) {
        // Loop over each row from 0 to 'n-1'
        for (int i = 0; i < n; i++) {
            // Loop over each column from 0 to 'n-1'
            for (int j = 0; j < n; j++) {
                // Print stars for the border of the square
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    // Print spaces for the hollow part of the square
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}
