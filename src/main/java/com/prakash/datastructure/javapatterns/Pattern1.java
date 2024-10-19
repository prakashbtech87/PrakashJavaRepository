package com.prakash.datastructure.javapatterns;

/**
 * The Pattern1 class demonstrates how to print a square pattern of '*' characters.
 *
 * <p>
 * This pattern generator prints a square based on the given size.
 * </p>
 *
 * <p>
 * Author: Prakash Karuppusamy
 * </p>
 */
public class Pattern1 {

    public static void main(String[] args) {
        // Prints a square pattern with 5 rows and columns
        printPattern(5);
    }

    /**
     * Prints a square pattern of '*' characters based on the given size.
     *
     * @param size The size of the square pattern (number of rows and columns)
     */
    public static void printPattern(int size) {
        // Loop for each row
        for (int row = 0; row < size; row++) {
            // Loop for each column in the current row
            for (int col = 0; col < size; col++) {
                // Print '*' followed by a space
                System.out.print(" *");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}