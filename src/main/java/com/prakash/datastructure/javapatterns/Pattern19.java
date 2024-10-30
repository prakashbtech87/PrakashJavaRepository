package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 *
 * This class generates a specific pattern of stars.
 * The pattern consists of two parts: an upper part with decreasing stars and increasing spaces,
 * and a lower part with increasing stars and decreasing spaces.
 */
public class Pattern19 {

    public static void main(String[] args) {
        // Call the method to print the pattern with 5 rows
        printPattern1(8);
    }

    /**
     * This method prints a pattern based on the given number of rows.
     *
     * @param n the number of rows for the pattern
     */
    public static void printPattern1(int n) {
        int iniSpace = 0; // Initialize the initial space count

        // Upper part of the pattern
        for (int i = 0; i < n; i++) {

            // Print stars in the current row
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Print spaces in the current row
            for (int j = 0; j < iniSpace; j++) {
                System.out.print(" ");
            }

            // Print stars in the current row
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Increase the space count by 2 for the next row
            iniSpace += 2;
            System.out.println();
        }

        // Reset the initial space count for the lower part
        iniSpace = 2*n-2;

        // Lower part of the pattern
        for (int i = 1; i <= n; i++) {

            // Print stars in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces in the current row
            for (int j = 0; j < iniSpace; j++) {
                System.out.print(" ");
            }

            // Print stars in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Decrease the space count by 2 for the next row
            iniSpace -= 2;
            System.out.println();
        }
    }
}
