package com.prakash.a2zdsa.hashing;

import java.util.ArrayList;
import java.util.List;

class CountFrequency {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length; // Size of the array
        List<Integer> result = new ArrayList<>();

        // Initialize the result list with zeros
        for (int i = 0; i < n; i++) {
            result.add(0);
        }

        // Precompute frequencies while iterating through the array
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                int index = num - 1; // Find the index for the number
                int currentFrequency = result.get(index); // Get the current frequency
                int updatedFrequency = currentFrequency + 1; // Increment the frequency
                result.set(index, updatedFrequency); // Update the result list
            }
        }

        return result; // Return the frequency list
    }

    public static void main(String[] args) {
        CountFrequency solution = new CountFrequency();

        // Example input
        int[] arr = {2, 3, 2, 3, 5};

        // Get the frequency count
        List<Integer> frequencies = solution.frequencyCount(arr);

        // Print the frequencies
        System.out.println(frequencies); // Output: [0, 2, 2, 0, 1]
    }
}