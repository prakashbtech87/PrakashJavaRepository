/**
 * Package containing Java pattern exercises.
 */
package com.prakash.datastructure.javapatterns;

/**
 * This class demonstrates printing a diamond-like pattern using asterisks ('*'). 
 * The pattern begins with an increasing number of stars, reaching a maximum, and 
 * then decreases, creating a symmetrical shape.
 *
 * <p>Example output for n = 5:</p>
 * <pre>
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 * </pre>
 *
 * <p>The pattern is achieved by looping to print an increasing and then decreasing number of stars in each row.</p>
 *
 * @author Prakash Karuppusamy
 */
public class Pattern10 {

    /**
     * Main method to start the program and display the diamond-like pattern.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Calling the method to print the pattern with a specified size
        printPattern(5);  // Change the number here to modify the pattern size
    }

    /**
     * Prints a diamond-like pattern based on the specified number of rows.
     *
     * @param n the maximum number of stars at the widest point in the pattern.
     */
    public static void printPattern(int n) {
        // Loop through each row from 1 to the total pattern height (2n - 1)
        for (int i = 1; i <= (2 * n - 1); i++) {
            int stars;

            // Determine the number of stars for the current row
            if (i <= n) {
                // First half: increment stars from 1 up to n
                stars = i;
            } else {
                // Second half: decrement stars from (n - 1) down to 1
                stars = 2 * n - i;
            }

            // Print the stars for the current row
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}