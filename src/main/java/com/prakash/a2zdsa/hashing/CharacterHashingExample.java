package com.prakash.a2zdsa.hashing;

/**
 * @author prakashkaruppusamy
 */

import java.util.Scanner;

public class CharacterHashingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        // Pre-compute the frequency of each character (assuming lowercase letters only)
        // Create an array to store frequencies of 26 lowercase letters (a-z)
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // Calculate the index for each character ('a' -> 0, 'b' -> 1, ..., 'z' -> 25)
            hash[s.charAt(i) - 'a']++;
        }

        // Input the number of queries
        System.out.println("Enter the number of queries:");
        int q = scanner.nextInt();

        // Process each query
        while (q-- > 0) {
            System.out.println("Enter a character to query:");
            char c = scanner.next().charAt(0);

            // Fetch the frequency of the queried character
            // (Assuming the input character is lowercase and valid)
            int frequency = hash[c - 'a'];

            // Output the frequency
            System.out.println("Frequency of '" + c + "': " + frequency);
        }

        scanner.close();
    }
}
