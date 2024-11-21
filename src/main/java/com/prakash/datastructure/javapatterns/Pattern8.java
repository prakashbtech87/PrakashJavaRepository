/**
 * Package containing Java pattern exercises.
 */
package com.prakash.datastructure.javapatterns;

/**
 * This class generates an inverted pyramid pattern of asterisks ('*') where each row narrows down
 * by reducing the number of stars and adding spaces on both sides for alignment.
 *
 * <p>Example output for n = 5:</p>
 * <pre>
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 * </pre>
 *
 * <p>The pattern creates a symmetrical triangle shape by decreasing the number of stars row by row.</p>
 *
 * @author Prakash Karuppusamy
 */
public class Pattern8 {

    /**
     * Main method to start the program and display the inverted pyramid pattern.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Calling the method to print the inverted pyramid pattern with specified rows
        printPattern(5);  // Modify this value to change the pattern size
    }

    /**
     * Prints an inverted pyramid pattern based on the specified number of rows.
     *
     * @param n the total number of rows for the inverted pyramid.
     */
    public static void printPattern(int n) {

        // Loop through each row in the inverted pyramid
        for (int i = 0; i < n; i++) {

            // Print leading spaces for alignment to center stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars in the current row
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            // Print trailing spaces for symmetry (not visible but maintains structure)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}