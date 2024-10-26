package com.prakash.datastructure.javapatterns;

/**
 * The Pattern6 class demonstrates how to print an inverted right-angled triangle
 * pattern of numbers. Each row starts with 1 and decreases the maximum number
 * in each row as the pattern progresses.
 *
 * <p>
 * Author: Prakash Karuppusamy
 * </p>
 */
class Pattern6 {

    public static void main(String[] args) {
        // Print the inverted right-angled triangle pattern with 5 rows
        printPattern(5);
    }

    /**
     * Prints an inverted right-angled triangle pattern of numbers. The first row
     * contains numbers from 1 to 'size', and each subsequent row has one less
     * number.
     *
     * @param size The number of rows in the pattern.
     */
    public static void printPattern(int size) {
        // Loop over each row from 0 to 'size'
        for (int row = 0; row <= size; row++) {
            // Loop to print numbers starting from 1 and ending at (size - row)
            for (int col = 1; col <= (size - row); col++) {
                // Print the current number followed by a space
                System.out.print(col + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}