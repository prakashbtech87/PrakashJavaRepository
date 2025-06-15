package com.prakash.striver_sde.pascaltriangle;

import java.util.*;


/**
 * @author prakashkaruppusamy
 */
 class PascalTriangleRow {

    static void pascalTriangle(int n) {

        long ans = 1;
        System.out.print(ans + " ");
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 5; // You can change this to any row number
        pascalTriangle(n); // Print the n-th row
    }
}
