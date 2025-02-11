package com.prakash.a2zdsa.sorting;

/**
 * @author prakashkaruppusamy
 *
 * This program implements the Bubble Sort algorithm in Java.
 * It takes user input for the array, sorts it using Bubble Sort, and prints the sorted array.
 */

import java.util.Scanner;

public class BubbleSort {

    /**
     * Bubble Sort Algorithm: Sorts an array in ascending order.
     *
     * @param arr The array to be sorted
     * @param n   The number of elements in the array
     */
    public static void bubbleSort(int[] arr, int n) {
        // Outer loop - controls the number of passes over the array
        for (int i = n - 1; i >= 0; i--) {
            boolean swapped = false; // Flag to check if swapping occurred

            // Inner loop - compares adjacent elements and swaps if needed
            for (int j = 0; j <= i - 1; j++) {
                // If the current element is greater than the next one, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swapping adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no swaps happened in a pass, the array is already sorted
            if (!swapped) {
                break; // Stop sorting early to optimize performance
            }
        }
    }

    /**
     * Main method: Reads input, calls the sorting function, and prints the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for user input

        // Taking array size input from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Read the number of elements

        // Creating an array to store user input
        int[] arr = new int[n];

        // Prompt user to enter elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Store each input in the array
        }

        // Sorting the array using Bubble Sort
        bubbleSort(arr, n);

        // Displaying the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line

        scanner.close(); // Close scanner to prevent resource leak
    }
}