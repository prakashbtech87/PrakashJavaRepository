package com.prakash.a2zdsa.sorting;

import java.util.Scanner;

/**
 * This program implements the Insertion Sort algorithm in Java.
 * It sorts an array of integers provided by the user.
 *
 * @author prakashkaruppusamy
 */

public class InsertionSort {

    /**
     * Performs Insertion Sort on the given array.
     *
     * @param arr The array to be sorted.
     * @param n   The number of elements in the array.
     */
    public static void insertionSort(int arr[], int n) {
        // Start from the second element (index 1) because a single element is already sorted
        for (int i = 1; i < n; i++) {
            int j = i; // Store the current index

            // Move elements of arr[0..i-1] that are greater than arr[i] one position ahead
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j] and arr[j-1] to shift smaller element leftwards
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--; // Move to the previous index for further comparisons
            }
        }
    }

    /**
     * The main method that takes user input, sorts the array, and displays the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Read the number of elements

        // Declare an array of size n
        int[] arr = new int[n];

        // Prompt user to enter array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read each element and store it in the array
        }

        // Sort the array using Insertion Sort
        insertionSort(arr, n);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print each element
        }
        System.out.println(); // Move to the next line for better output formatting

        scanner.close(); // Close scanner to free up resources
    }
}