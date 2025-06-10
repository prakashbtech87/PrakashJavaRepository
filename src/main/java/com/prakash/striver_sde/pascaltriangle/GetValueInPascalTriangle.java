package com.prakash.striver_sde.pascaltriangle;

import java.util.*;

public class GetValueInPascalTriangle {

    /**
     * This method calculates the binomial coefficient C(n, r), also known as "n choose r".
     * It uses an iterative approach to avoid calculating large factorials directly.
     *
     * @param n the total number of items
     * @param r the number of items to choose
     * @return the value of C(n, r)
     */
    public static long nCr(int n, int r) {
        long res = 1;

        // Loop to compute nCr = n! / (r! * (n-r)!) using a simplified formula:
        // C(n, r) = [n * (n-1) * ... * (n-r+1)] / [1 * 2 * ... * r]
        for (int i = 0; i < r; i++) {
            res = res * (n - i);   // Multiply numerator part (n, n-1, ..., n-r+1)
            res = res / (i + 1);   // Divide by denominator part (1, 2, ..., r)
        }
        return res;
    }

    /**
     * This method returns the element at a specific row and column in Pascal's Triangle.
     * Note: Pascal's Triangle is 1-indexed, so row 1 starts with value 1.
     *
     * @param r the row number (1-indexed)
     * @param c the column number (1-indexed)
     * @return the value at the (r, c) position in Pascal's Triangle
     */
    public static int pascalTriangle(int r, int c) {
        // In Pascal's Triangle, element at (r, c) = C(r-1, c-1)
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    public static void main(String[] args) {
        int r = 5; // Specify the row number (1-indexed)
        int c = 3; // Specify the column number (1-indexed)

        // Get the element at the specified position in Pascal's Triangle
        int element = pascalTriangle(r, c);

        // Print the result
        System.out.println("The element at position (r,c) is: " + element);
    }
}