package com.prakash.a2zdsa.recursion;

/**
 * This class demonstrates printing "GFG" followed by the current value of `n`
 * recursively without using any loops.
 * Author: Prakash Karuppusamy
 */
public class PrintWithoutLoop {

    /**
     * This method prints "GFG" followed by the value of `n` recursively.
     *
     * @param n the number of times to print "GFG". The value decreases with each
     *          recursive call until the base condition is met.
     */
    static void printGfg(int n) {
        // Base case: If n is 0 or negative, stop the recursion.
        if (n <= 0) return;

        // Print "GFG" followed by the current value of n.
        System.out.print(" GFG" + n);

        // Recursive call with n decremented by 1.
        printGfg(n - 1);
    }

    /**
     * The main method to test the printGfg method.
     *
     * @param args Command-line arguments (not used here).
     */
    public static void main(String[] args) {
        // Call the printGfg method with n = 10.
        printGfg(10);
    }
}