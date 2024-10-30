package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 *
 * This class generates a specific pattern of numbers.
 * The pattern consists of numbers forming a diamond shape with decreasing values towards the center.
 */
public class Pattern22 {

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
        // Loop over each row from 0 to '2n-2'
        for (int i = 0; i < 2 * n - 1; i++) {
            // Loop over each column from 0 to '2n-2'
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i; // Distance from the top edge
                int left = j; // Distance from the left edge
                int right = (2 * n - 2) - j; // Distance from the right edge
                int down = (2 * n - 2) - i; // Distance from the bottom edge

                // Calculate the value to be printed based on the minimum distance to any edge
                System.out.print((n - Math.min(Math.min(top, down), Math.min(left, right))) + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
