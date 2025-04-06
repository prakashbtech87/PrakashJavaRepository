package com.prakash.a2zdsa.arrays;

import java.util.Arrays;

/**
 * @author prakashkaruppusamy
 */
public class RemoveDuplicatesFromSortedArray {

    private static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // Return the new length of unique elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        System.out.println("Before removing duplicates:");
        printArray(arr, arr.length); // Print entire array initially
        int newLength = removeDuplicates(arr); // Get length of unique elements
        System.out.println("\nAfter removing duplicates:");
        printArray(arr, newLength); // Print only unique elements
    }

    private static void printArray(int[] arr, int length) {
        // Print elements up to 'length'
        Arrays.stream(arr, 0, length).forEach(num -> System.out.print(num + " "));
    }
}
