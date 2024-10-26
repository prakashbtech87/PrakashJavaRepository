package com.prakash.datastructure.javapatterns;

/**
 * The Pattern4 class demonstrates how to print a right-angled triangle pattern
 * where each row is filled with the same number, equal to the current row number.
 *
 * <p>
 * Author: Prakash Karuppusamy
 * </p>
 */
public class Pattern4 {

    public static void main(String[] args) {
        // Print the right-angled triangle pattern with 5 rows
        printPattern(5);
    }

    /**
     * Prints a right-angled triangle pattern of numbers. Each row contains the
     * same number repeated, and the number corresponds to the row number.
     *
     * @param size The number of rows in the pattern.
     */
    public static void printPattern(int size) {
        // Loop over each row from 1 to 'size'
        for (int row = 1; row <= size; row++) {
            // Loop over each column, printing the current row number
            for (int col = 1; col <= row; col++) {
                // Print the current row number followed by a space
                System.out.print(row + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}