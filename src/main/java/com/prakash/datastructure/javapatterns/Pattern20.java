package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 *
 * This class generates a specific pattern of stars.
 * The pattern consists of stars forming a diamond shape with spaces in the middle.
 */
public class Pattern20 {

    public static void main(String[] args) {
        // Call the method to print the pattern with 5 rows
        printPattern1(5);
    }

    /**
     * This method prints a diamond pattern based on the given number of rows.
     *
     * @param n the number of rows for the pattern
     */
    public static void printPattern1(int n) {
        int spaces = 2 * n - 2; // Initialize the space count

        // Loop over each row from 1 to '2n-1'
        for (int i = 1; i <= 2 * n - 1; i++) {

            // Determine the number of stars for the current row
            int stars = i;
            if (i > n) stars = 2 * n - i;

            // Print stars in the current row
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces in the current row
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars in the current row
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

            // Adjust the space count for the next row
            if (i < n) spaces -= 2;
            else spaces += 2;
        }
    }
}
