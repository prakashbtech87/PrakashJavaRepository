package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 *
 * This class generates a specific pattern of numbers.
 * The pattern consists of numbers increasing sequentially across rows.
 */
public class Pattern13 {

    public static void main(String[] args) {
        // Call the method to print the pattern with 5 rows
        printPattern(5);
    }

    /**
     * This method prints a pattern based on the given number of rows.
     *
     * @param n the number of rows for the pattern
     */
    public static void printPattern(int n) {
        int k = 1; // Initialize the number to be printed

        // Loop over each row from 1 to 'n'
        for (int i = 1; i <= n; i++) {

            // Print numbers in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++; // Increment the number to be printed
            }

            // Move to the next line
            System.out.println();
        }
    }
}

