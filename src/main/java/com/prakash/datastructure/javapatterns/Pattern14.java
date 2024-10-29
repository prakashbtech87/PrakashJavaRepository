
package com.prakash.datastructure.javapatterns;

/**
 * Author: Prakash Karuppusamy
 *
 * This class generates a specific pattern of letters.
 * The pattern consists of letters starting from 'A' and increasing sequentially across rows.
 */
public class Pattern14 {

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
            // Print letters in the current row
            for (Character c = 'A'; c <= 'A' + i; c++) {
                System.out.print(c + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
