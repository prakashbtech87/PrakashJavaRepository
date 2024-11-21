/**
 * Package containing Java pattern exercises.
 */
package com.prakash.datastructure.javapatterns;

/**
 * This class demonstrates printing a binary number triangle pattern. Each row alternates
 * between 1 and 0, starting with either 1 or 0 depending on the row number.
 *
 * <p>Example output for n = 5:</p>
 * <pre>
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * </pre>
 *
 * <p>The pattern alternates the starting value (1 or 0) in each row, creating a triangle
 * where each element in the row switches between 1 and 0.</p>
 *
 * @author Prakash Karuppusamy
 */
public class Pattern11 {

    /**
     * Main method to start the program and display the binary number pattern.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Call to print the binary number pattern with the specified size
        printPattern(5);  // Change the number here to modify the pattern size
    }

    /**
     * Prints a binary number triangle pattern with alternating 1s and 0s.
     *
     * @param n the number of rows for the binary triangle pattern.
     */
    public static void printPattern(int n) {
        int start=1; // Variable to hold the starting value of each row (1 or 0)

        // Loop over each row in the triangle
        for (int i = 0; i < n; i++) {
            // Set the starting value based on whether the row is even or odd
            start = (i % 2 == 0) ? 1 : 0;

            // Loop to print values in each row, switching between 1 and 0
            for (int j = 0; j <= i; j++) {
                System.out.print(start+" "); // Print the current value
                start = 1 - start; // Toggle the value between 1 and 0
            }

            // Move to the next line after completing each row
            System.out.println();
        }
    }
}