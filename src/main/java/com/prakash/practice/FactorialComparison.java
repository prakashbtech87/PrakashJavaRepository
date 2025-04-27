package com.prakash.practice;

public class FactorialComparison {

    public static void main(String[] args) {
        // Array of test case numbers
        int[] testCases = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        long totalRecursiveTime = 0;
        long totalIterativeTime = 0;

        for (int number : testCases) {
            System.out.println("Testing factorial for: " + number);

            // Measuring time for recursive approach
            long startTime = System.nanoTime();
            long recursiveResult = factorialRecursive(number);
            long endTime = System.nanoTime();
            long recursiveTime = endTime - startTime;
            totalRecursiveTime += recursiveTime;

            // Measuring time for iterative approach
            startTime = System.nanoTime();
            long iterativeResult = factorialIterative(number);
            endTime = System.nanoTime();
            long iterativeTime = endTime - startTime;
            totalIterativeTime += iterativeTime;

            // Printing results for each test case
            System.out.println("Recursive Factorial: " + recursiveResult);
            System.out.println("Time taken by Recursive Approach: " + recursiveTime + " nanoseconds");

            System.out.println("Iterative Factorial: " + iterativeResult);
            System.out.println("Time taken by Iterative Approach: " + iterativeTime + " nanoseconds");
            System.out.println();
        }

        // Conclusion
        System.out.println("Total Time for Recursive Approach: " + totalRecursiveTime + " nanoseconds");
        System.out.println("Total Time for Iterative Approach: " + totalIterativeTime + " nanoseconds");

        if (totalRecursiveTime < totalIterativeTime) {
            System.out.println("\nThe Recursive Approach is faster overall.");
        } else if (totalRecursiveTime > totalIterativeTime) {
            System.out.println("\nThe Iterative Approach is faster overall.");
        } else {
            System.out.println("\nBoth approaches took the same total time.");
        }
    }

    // Recursive approach for calculating factorial
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Iterative approach for calculating factorial
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}