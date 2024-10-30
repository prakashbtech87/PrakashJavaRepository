
package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 *
 * This class generates a specific pattern of characters.
 * The pattern consists of characters starting from 'A' and forming a pyramid shape.
 */
public class Pattern17 {

    public static void main(String[] args) {
        // Call the method to print the pattern with 5 rows
        printPattern1(5);
    }

    /**
     * This method prints a pyramid pattern based on the given number of rows.
     *
     * @param n the number of rows for the pattern
     */
    public static void printPattern1(int n) {
        // Loop over each row from 0 to 'n-1'
        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Initialize the character to 'A'
            char ch = 'A';
            // Calculate the breakpoint for the character increment/decrement
            int breakPoint = (2 * i + 1) / 2;

            // Print characters in the current row
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print(ch);
                // Increment or decrement the character based on the position
                ch += (j <= breakPoint) ? 1 : -1;
            }

            // Print trailing spaces (optional, for symmetry)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
