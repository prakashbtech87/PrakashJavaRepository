package com.prakash.a2zdsa.maths;

/**
 * A simple program to calculate the nth Fibonacci number using recursion.
 * <p>
 * Author: Prakash Karuppusamy
 */
public class Fibonacci {

    /**
     * Recursive method to calculate the nth Fibonacci number.
     * <p>
     * The Fibonacci sequence is defined as:
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n-1) + F(n-2) for n > 1
     *
     * @param n The position in the Fibonacci sequence to calculate.
     * @return The nth Fibonacci number.
     */
    static int f(int n) {
        // Base case: If n is 0 or 1, return n directly.
        if (n <= 1) return n;

        // Recursive case: Calculate the (n-1)th and (n-2)th Fibonacci numbers.
        int last = f(n - 1); // F(n-1)
        int slast = f(n - 2); // F(n-2)

        // Return the sum of the two previous Fibonacci numbers.
        return last + slast;
    }

    /**
     * Main method to test the Fibonacci calculation.
     * <p>
     * In this example, we calculate and print the 4th Fibonacci number.
     */
    public static void main(String[] args) {
        // Print the 4th Fibonacci number (index starts at 0).
        System.out.println(f(4)); // Output will be 3
    }
}