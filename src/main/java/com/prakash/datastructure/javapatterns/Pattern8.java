/**
 * Package containing Java pattern exercises.
 */
package com.prakash.datastructure.javapatterns;

/**
 * This program prints an inverted pyramid pattern of asterisks ('*').
 * The pattern reduces in width with each row and centers the stars by balancing spaces on both sides.
 *
 * <p>Example output for n = 5:
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 * </p>
 *
 * @author Prakash Karuppusamy
 */
public class Pattern8 {

    /**
     * Main method to start the program and print the inverted pyramid pattern.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        printPattern(5); // Adjust the value to modify the pyramid size
    }

    /**
     * Prints an inverted pyramid pattern based on the specified size.
     *
     * @param n the number of rows for the inverted pyramid pattern
     */
    public static void printPattern(int n) {

        // Loop over each row for the inverted pyramid
        for (int i = 0; i < n; i++) {

            // Print leading spaces to position stars centrally
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars for the inverted pyramid row
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            // Print trailing spaces to balance the pyramid (optional)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}