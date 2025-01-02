package com.prakash.a2zdsa.recursion;

/**
 * This class demonstrates the use of recursion to calculate the factorial of a number.
 * A factorial of a number `n` is defined as the product of all positive integers less than or equal to `n`.
 * Mathematically: n! = n * (n-1) * (n-2) * ... * 1, with 0! = 1 as a base case.
 *
 * Author: Prakash Karuppusamy
 */
public class FactorialUsingRecursion {

    /**
     * This method calculates the factorial of a given number using recursion.
     *
     * @param n the number for which the factorial is to be calculated. Must be a non-negative integer.
     * @return the factorial of the given number.
     *
     * Example:
     * - factorial(5) = 5 * factorial(4)
     * - factorial(4) = 4 * factorial(3)
     * - factorial(3) = 3 * factorial(2)
     * - factorial(2) = 2 * factorial(1)
     * - factorial(1) = 1 * factorial(0)
     * - factorial(0) = 1 (base case)
     * - Result: 5 * 4 * 3 * 2 * 1 = 120
     */
    static int factorial(int n) {
        // Base case: If n is 0, the factorial is defined as 1.
        if (n == 0) {
            return 1;
        }
        // Recursive case: Multiply the current number (n) by the factorial of (n-1).
        return n * factorial(n - 1);
    }

    /**
     * The main method to test the factorial calculation.
     * It calls the factorial method with a test value and prints the result.
     *
     * Example:
     * - Input: 5
     * - Output: 120
     */
    public static void main(String[] args) {
        // Calculate the factorial of 5 and print the result.
        System.out.println(factorial(5)); // Output will be 120
    }
}