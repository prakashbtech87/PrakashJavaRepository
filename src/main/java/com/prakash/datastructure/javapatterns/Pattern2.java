/**
 * Author: Prakash Karuppusamy
 *
 * This class is designed to print a square pattern based on the size provided.
 * It will print a triangle-like structure made of asterisks (*).
 */
package com.prakash.datastructure.javapatterns;

public class Pattern2 {

    /**
     * Main method that initiates the pattern printing.
     *
     * @param args command-line arguments (not used here)
     */
    public static void main(String[] args) {
        // Prints a square pattern with 5 rows and columns
        printPattern(3);
    }

    /**
     * Prints a pattern where each row contains increasing numbers of asterisks.
     *
     * @param size the number of rows and the maximum number of columns for the pattern
     */
    public static void printPattern(int size) {
        // Loop over each row
        for (int row = 0; row < size; row++) {
            // Loop to print the correct number of asterisks for the current row
            for (int col = 0; col <= row; col++) {
                System.out.print('*' + " ");
            }
            // Move to the next line after printing all columns for the current row
            System.out.println();
        }
    }
}