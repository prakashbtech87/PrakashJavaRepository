package com.prakash.a2zdsa.maths;

import java.util.Scanner; // Import Scanner class for user input
import java.util.Set; // Import Set interface for storing unique values
import java.util.TreeSet; // Import TreeSet class for storing sorted unique values

/**
 * This program calculates and prints all divisors of a given number using an optimized approach.
 * Author: prakashkaruppusamy
 */
public class PrintDivisorNewApproach {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter number ");

        // Read the input number from the user
        int n = scanner.nextInt();

        // Create a TreeSet to store divisors in sorted order without duplicates
        Set<Integer> ts = new TreeSet<>();

        // Loop from 1 to the square root of the number
        // This optimizes the divisor finding process as divisors occur in pairs
        for (int i = 1; i <= Math.sqrt(n); i++) {
            // Check if 'i' is a divisor of 'n'
            if (n % i == 0) {
                // Add the divisor 'i' to the TreeSet
                ts.add(i);

                // Check if the paired divisor is not equal to 'i' (to avoid duplicates for perfect squares)
                if (n / i != i) {
                    // Add the paired divisor 'n / i' to the TreeSet
                    ts.add(n / i);
                }
            }
        }

        // Print all divisors in sorted order using TreeSet
        System.out.print("Divisors of " + n + ": ");
        int size = ts.size(); // Get the size of the TreeSet
        int index = 0; // Initialize an index to track the current element

        for (int val : ts) {
            index++;
            // Print the divisor, add a comma only if it's not the last element
            if (index == size) {
                System.out.print(val);
            } else {
                System.out.print(val + ", ");
            }
        }
    }
}