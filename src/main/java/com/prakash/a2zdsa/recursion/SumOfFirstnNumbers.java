package com.prakash.a2zdsa.recursion;

/**
 * This program calculates the sum of the first 'n' natural numbers using recursion.
 * Author: Prakash Karuppusamy
 */
public class SumOfFirstnNumbers {

    /**
     * Recursive method to calculate the sum of the first 'n' natural numbers.
     *
     * @param n The number up to which the sum needs to be calculated.
     * @return The sum of the first 'n' natural numbers.
     *
     * Explanation:
     * - If 'n' is 0, return 0 (base case).
     * - Otherwise, return the current number 'n' added to the result of the recursive call for (n-1).
     * - This breaks the problem into smaller sub-problems until the base case is reached.
     */
    static int sumOfSeries(int n) {
        // Base case: If n is 0, the sum is 0 as there are no numbers to add.
        if (n == 0) {
            return 0;
        }
        // Recursive case: Add the current number 'n' to the sum of the series from 1 to (n-1).
        return n + sumOfSeries(n - 1);
    }

    public static void main(String[] args) {
        // Testing the sumOfSeries method with an example.
        // Here, we are calculating the sum of the first 3 natural numbers (1 + 2 + 3 = 6).
        System.out.println(sumOfSeries(3)); // Output should be 6.
    }
}