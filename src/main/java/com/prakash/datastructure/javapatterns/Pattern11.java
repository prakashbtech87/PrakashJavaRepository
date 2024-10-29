package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 * 
 * This class generates a specific pattern of numbers.
 * The pattern consists of numbers increasing from 1 to the current row number,
 * followed by spaces, and then numbers decreasing back to 1.
 */
public class Pattern11 {

    public static void main(String[] args) {
        // Call the method to print the pattern with 5 rows
        printPattern(5);
    }

    /**
     * This method prints a pattern based on the given number of rows.
     * 
     * @param n the number of rows for the pattern
     */
    public static void printPattern(int n) {
        int space = 2 * (n - 1); // Initialize the space variable

        // Loop over each row from 1 to 'n'
        for (int i = 1; i <= n; i++) {

            // Print increasing numbers from 1 to 'i'
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers from 'i' to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();

            // Decrease the space count by 2 for the next row
            space -= 2;
        }
    }
}
