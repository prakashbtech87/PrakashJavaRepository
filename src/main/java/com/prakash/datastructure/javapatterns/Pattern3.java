package com.prakash.datastructure.javapatterns;

/**
 * The Pattern3 class demonstrates how to print a right-angled triangle pattern
 * where each row contains consecutive numbers starting from 1.
 *
 * <p>
 * Author: Prakash Karuppusamy
 * </p>
 */
public class Pattern3 {

    public static void main(String[] args) {
        // Print the right-angled triangle pattern with 5 rows
        printPattern(5);
    }

    /**
     * Prints a right-angled triangle pattern of numbers. The first row contains
     * 1, the second row contains 1 2, and so on, up to the given size.
     *
     * @param size The number of rows in the pattern.
     */
    public static void printPattern(int size) {
        // Loop over each row from 1 to 'size'
        for (int row = 1; row <= size; row++) {
            // Loop over each column and print numbers from 1 to the current row number
            for (int col = 1; col <= row; col++) {
                // Print the current column number followed by a space
                System.out.print(col + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}