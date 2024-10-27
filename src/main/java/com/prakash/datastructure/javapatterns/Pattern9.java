/**
 * Package containing Java pattern exercises.
 */
package com.prakash.datastructure.javapatterns;

/**
 * This class demonstrates printing a symmetric, inverted pyramid pattern of asterisks ('*').
 * The pattern starts as a regular pyramid and then inverts.
 * Each row reduces the width of stars while maintaining symmetry with spaces.
 *
 * <p>Example output for n = 5:</p>
 * <pre>
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 * </pre>
 *
 * <p>This output pattern uses two sections: the first builds the pyramid, and the second inverts it.</p>
 *
 * @author Prakash Karuppusamy
 */
public class Pattern9 {

    /**
     * Main method to start the program and print the inverted pyramid pattern.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        printPattern(5); // Modify the parameter to change the size of the pyramid
    }

    /**
     * Prints a symmetric inverted pyramid pattern based on the specified size.
     *
     * @param n the number of rows for each section of the pyramid pattern.
     */
    public static void printPattern(int n) {

        // First part: builds the pyramid from top to bottom
        for (int i = 0; i < n; i++) {

            // Print leading spaces to align the stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars in the current row
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Optional trailing spaces for alignment (not visible, but maintains symmetry)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to the next line for the next row
            System.out.println();
        }

        // Second part: creates the inverted pyramid from top to bottom
        for (int i = 0; i < n; i++) {

            // Print leading spaces to align the stars centrally
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars in decreasing order for each row
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            // Optional trailing spaces for alignment
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}