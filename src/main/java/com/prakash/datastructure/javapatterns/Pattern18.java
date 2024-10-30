package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 *
 * This class generates a specific pattern of characters.
 * The pattern consists of characters starting from 'E' and decreasing sequentially across rows.
 */
public class Pattern18 {

    public static void main(String[] args) {
        // Call the method to print the pattern with 5 rows
        printPattern1(5);
    }

    /**
     * This method prints a pattern based on the given number of rows.
     *
     * @param n the number of rows for the pattern
     */
    public static void printPattern1(int n) {
        // Loop over each row from 0 to 'n-1'
        for (int i = 0; i < n; i++) {
            // Print characters in the current row starting from 'E' - i to 'E'
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
