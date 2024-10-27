/**
 * This program generates a pyramid pattern of stars (*) based on the input size.
 * Each row of the pattern consists of spaces and stars arranged symmetrically to create a pyramid shape.
 *
 * Author: Prakash Karuppusamy
 */

package com.prakash.datastructure.javapatterns;

public class Pattern7 {

    /**
     * Main method to run the pattern printing function.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int n = 5; // Size of the pyramid
        printPattern(n);
    }

    /**
     * Prints a pyramid pattern of stars (*) with the specified size.
     * The pattern is constructed with spaces and stars arranged in each row.
     *
     * @param n The height of the pyramid, representing the number of rows.
     */
    public static void printPattern(int n) {

        // Loop through each row
        for (int i = 0; i < n; i++) {

            // Print spaces on the left side of the pyramid
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars in the middle section of the pyramid
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Print spaces on the right side of the pyramid (optional for symmetry)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
