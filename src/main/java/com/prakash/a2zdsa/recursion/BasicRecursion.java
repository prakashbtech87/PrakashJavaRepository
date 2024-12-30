package com.prakash.a2zdsa.recursion;

/**
 * This class demonstrates basic recursion by printing numbers from 1 to n.
 * Author: Prakash Karuppusamy
 */
public class BasicRecursion {

    /**
     * This method prints numbers from 1 to n using recursion.
     *
     * @param n the number up to which the numbers will be printed
     */
    public static void printNos(int n) {
        // Base case: If n is 0, stop the recursion.
        if (n == 0) {
            return; // Exits the current recursion stack.
        }

        // Recursive call: Call the function with n-1 to process smaller numbers first.
        printNos(n - 1);

        // After returning from the recursive call, print the current number.
        // This ensures numbers are printed in ascending order (1 to n).
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // Call the printNos method to print numbers from 1 to 14.
        printNos(14);
    }
}