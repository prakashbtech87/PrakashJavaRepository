package com.prakash.a2zdsa.recursion;

/**
 * ReverseArray class demonstrates reversing an array using recursion.
 * Author: Prakash Karuppusamy
 */
public class ReverseArray {

    /**
     * Recursive method to reverse an array.
     *
     * @param i   Current index to swap from the start.
     * @param arr The array to be reversed.
     * @param n   Length of the array.
     */
    static void reverse(int i, int[] arr, int n) {
        // Base condition: Stop recursion when the middle of the array is reached.
        if (i >= n / 2) return;

        // Swap the elements at positions i and (n - i - 1).
        swap(arr, i, n - i - 1);

        // Recursive call to reverse the next pair of elements.
        reverse(i + 1, arr, n);
    }

    /**
     * Helper method to swap two elements in an array.
     *
     * @param arr The array containing the elements.
     * @param i   Index of the first element.
     * @param j   Index of the second element.
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; // Store the value at index i in a temporary variable.
        arr[i] = arr[j];   // Assign the value at index j to index i.
        arr[j] = temp;     // Assign the temporary value to index j.
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // Input array.

        System.out.println("Original array:");
        printArray(arr);

        // Call the reverse method to reverse the array.
        reverse(0, arr, arr.length);

        System.out.println("Reversed array:");
        printArray(arr);
    }

    /**
     * Utility method to print an array.
     *
     * @param arr The array to be printed.
     */
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}