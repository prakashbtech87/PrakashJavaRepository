package com.prakash.leetcode.codeio;

/**
 * @author prakashkaruppusamy
 */
public class HelloWorld {
    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 30; // Example input
        long startIter = System.nanoTime();
        int fibIter = fibonacciIterative(n);
        long endIter = System.nanoTime();
        long timeIter = endIter - startIter;

        long startRec = System.nanoTime();
        int fibRec = fibonacciRecursive(n);
        long endRec = System.nanoTime();
        long timeRec = endRec - startRec;

        System.out.println("Fibonacci(" + n + ") Iterative: " + fibIter + ", Time: " + timeIter + " ns");
        System.out.println("Fibonacci(" + n + ") Recursive: " + fibRec + ", Time: " + timeRec + " ns");
    }
}
