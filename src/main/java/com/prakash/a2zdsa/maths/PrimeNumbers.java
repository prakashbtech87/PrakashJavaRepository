package com.prakash.a2zdsa.maths; // Package declaration

import java.util.Scanner; // Importing Scanner class to read user input

/**
 * This class checks if a given number is a prime number.
 * A prime number has exactly two divisors: 1 and the number itself.
 *
 * Author: Prakash Karuppusamy
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        int count = 0; // Variable to count the number of divisors of the input number

        int n = scanner.nextInt(); // Read an integer input from the user

        // Loop to find all divisors of the number `n`
        for (int i = 1; i * i <= n; i++) { // Iterate from 1 to the square root of `n`
            if (n % i == 0) { // Check if `i` is a divisor of `n`
                count++; // Increment count for the divisor `i`
                if (n / i != i) { // Check if `i` and `n / i` are distinct divisors
                    count++; // Increment count for the distinct divisor `n / i`
                }
            }
        }

        // A number is prime if it has exactly 2 divisors (1 and itself)
        if (count == 2) { // Check if the number of divisors is exactly 2
            System.out.print("true"); // Print "true" if the number is prime
        } else {
            System.out.print("false"); // Print "false" if the number is not prime
        }
    }
}