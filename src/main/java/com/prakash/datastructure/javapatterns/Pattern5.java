package com.prakash.datastructure.javapatterns;

/**
 * The Pattern5 class demonstrates how to print an inverted right-angled triangle
 * pattern made up of '*' characters. The number of '*' decreases with each row.
 *
 * <p>
 * Author: Prakash Karuppusamy
 * </p>
 */
class Pattern5 {

    public static void main(String[] args) {
        // Print the inverted right-angled triangle pattern with 5 rows
        printPattern(5);
    }

    /**
     * Prints an inverted right-angled triangle pattern of '*' characters. The
     * first row contains 'size' number of '*' and each subsequent row contains
     * one fewer '*' than the previous row.
     *
     * @param size The number of rows in the pattern.
     */
    public static void printPattern(int size) {
        // Loop over each row from 1 to 'size'
        for (int row = 1; row <= size; row++) {
            // Loop to print '*' in decreasing order for each row
            for (int col = 1; col <= (size - row + 1); col++) {
                // Print '*' followed by a space
                System.out.print('*' + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}