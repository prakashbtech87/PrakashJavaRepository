package com.prakash.a2zdsa.arrays;

/**
 * This class demonstrates the Linear Search algorithm.
 * Linear Search is used to find the index of an element in an array by checking each element one by one.
 *
 * Time Complexity: O(n), where n is the number of elements in the array.
 * Space Complexity: O(1), since no extra space is used.
 *
 * Author: Prakash Karuppusamy
 */
public class LinearSearch {

    /**
     * Searches for the element x in the given array using linear search.
     *
     * @param arr The array to search.
     * @param x   The target element to find.
     * @return The index of x if found; otherwise, -1.
     */
    public static int linearSearch(int arr[], int x) {
        // Traverse the array from the beginning
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the target, return its index
            if (arr[i] == x) {
                return i;
            }
        }
        // If element not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test Case 1: Element is present in the middle
        int[] arr1 = {5, 10, 15, 20, 25};
        System.out.println("Test Case 1: Index = " + linearSearch(arr1, 15)); // Expected output: 2

        // Test Case 2: Element is at the beginning
        int[] arr2 = {42, 56, 78, 90};
        System.out.println("Test Case 2: Index = " + linearSearch(arr2, 42)); // Expected output: 0

        // Test Case 3: Element is at the end
        int[] arr3 = {7, 8, 9, 10};
        System.out.println("Test Case 3: Index = " + linearSearch(arr3, 10)); // Expected output: 3

        // Test Case 4: Element is not present in the array
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 4: Index = " + linearSearch(arr4, 99)); // Expected output: -1
    }
}