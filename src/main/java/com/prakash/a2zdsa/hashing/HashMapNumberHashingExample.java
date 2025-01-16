package com.prakash.a2zdsa.hashing;

import java.util.HashMap;
import java.util.Scanner;


/**
 * @author prakashkaruppusamy
 */

public class HashMapNumberHashingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user to input the size of the array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); // Read the size of the array

        // Step 2: Pre-compute the frequency of numbers while taking inputs
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); // Read each number
            // Increment the frequency for the number or set it to 1 if not present
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Print the frequency of each number (key-value pairs)
        System.out.println("Frequency of each number:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " : " + frequencyMap.get(key));
        }

        // Step 4: Ask the user for the number of queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt(); // Number of queries

        // Step 5: Process each query interactively
        System.out.println("Enter the numbers you want to query:");
        while (q-- > 0) {
            int number = sc.nextInt(); // Input the number to query
            // Fetch and print the frequency of the number
            int frequency = frequencyMap.getOrDefault(number, 0);
            System.out.println("Frequency of " + number + " is: " + frequency);
        }

        sc.close(); // Close the scanner to free resources
    }
}
