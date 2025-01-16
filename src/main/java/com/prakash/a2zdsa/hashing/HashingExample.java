package com.prakash.a2zdsa.hashing;

/**
 * @author prakashkaruppusamy
 */

import java.util.HashMap;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Scanner;

public class HashingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user to input the string
        System.out.println("Enter a string:");
        String input = sc.nextLine(); // Read the entire string

        // Step 2: Pre-compute the frequency of characters in the string
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get each character in the string
            // Increment the frequency for the character or set it to 1 if not present
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Print the frequency of each character (key-value pairs)
        System.out.println("Frequency of each character:");
        for (char key : frequencyMap.keySet()) {
            System.out.println(key + " : " + frequencyMap.get(key));
        }

        // Step 4: Ask the user for the number of queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt(); // Number of queries

        // Step 5: Process each query interactively
        System.out.println("Enter the characters you want to query:");
        while (q-- > 0) {
            char character = sc.next().charAt(0); // Input the character to query
            // Fetch and print the frequency of the character
            int frequency = frequencyMap.getOrDefault(character, 0);
            System.out.println("Frequency of '" + character + "' is: " + frequency);
        }

        sc.close(); // Close the scanner to free resources
    }
}