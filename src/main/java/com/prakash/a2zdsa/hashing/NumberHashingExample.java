package com.prakash.a2zdsa.hashing;

import java.util.Scanner;

/**
 * @author prakashkaruppusamy
 */

public class NumberHashingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Precompute the frequency of each number (assuming numbers are in the range 0 to 12)
        int[] hash = new int[13]; // Array to store frequency for numbers 0 to 12
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++; // Increment the frequency for the corresponding number
        }

        // Input the number of queries
        System.out.println("Enter the number of queries:");
        int q = scanner.nextInt();

        // Process each query
        System.out.println("Enter the numbers to query:");
        while (q-- > 0) {
            int number = scanner.nextInt();

            // Fetch and print the frequency of the queried number
            if (number >= 0 && number <= 12) {
                System.out.println("Frequency of " + number + ": " + hash[number]);
            } else {
                System.out.println("Number " + number + " is out of range (0-12).");
            }
        }

        scanner.close();
    }
}