package com.prakash.a2zdsa.maths;

/**
 * This program calculates the sum of all divisors of integers from 1 to a given number `n`.
 * Author: Prakash Karuppusamy
 */
public class Divisors {

    /**
     * This method calculates the sum of all divisors of numbers from 1 to `n`.
     *
     * @param n the upper limit up to which divisors are calculated.
     * @return the total sum of all divisors for numbers from 1 to `n`.
     */
    public static int sumOfDivisors(int n) {
        // Initialize a variable to store the sum of divisors
        int sum = 0;

        // Outer loop: iterate through each number from 1 to n
        for (int i = 1; i <= n; i++) {
            // Inner loop: find divisors of the current number `i`
            for (int j = 1; j <= i; j++) {
                // Check if `j` is a divisor of `i`
                if (i % j == 0) {
                    // Add the divisor to the sum
                    sum = sum + j;
                }
            }
        }
        // Return the total sum of divisors
        return sum;
    }

    /**
     * The main method to test the sumOfDivisors function.
     *
     * @param args command-line arguments (not used here).
     */
    public static void main(String[] args) {
        // Call the sumOfDivisors method with n = 10 and print the result
        System.out.println("\nSum of divisors from 1 to 10: " + sumOfDivisors(10));
    }

}