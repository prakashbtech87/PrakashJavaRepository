package com.prakash.a2zdsa.arrays;

import java.util.*;

/**
 * Author: Prakash Karuppusamy
 *
 * This program finds the union of two sorted arrays.
 * It prints both input arrays and then the result containing all unique elements
 * from both arrays in sorted order.
 */
class UnionOfArray {

    // Method to find union of two sorted arrays
    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0; // Start pointers at beginning of both arrays
        ArrayList<Integer> unionResultList = new ArrayList<>(); // Stores the final union result

        // Traverse both arrays while both pointers are within bounds
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                // Add arr1[i] if it's not a duplicate of the last inserted value
                if (unionResultList.isEmpty() || unionResultList.get(unionResultList.size() - 1) != arr1[i]) {
                    unionResultList.add(arr1[i]);
                }
                i++; // Move pointer in arr1
            } else {
                // Add arr2[j] if it's not a duplicate of the last inserted value
                if (unionResultList.isEmpty() || unionResultList.get(unionResultList.size() - 1) != arr2[j]) {
                    unionResultList.add(arr2[j]);
                }
                j++; // Move pointer in arr2
            }
        }

        // If there are remaining elements in arr1, add them (skip duplicates)
        while (i < arr1.length) {
            if (unionResultList.get(unionResultList.size() - 1) != arr1[i]) {
                unionResultList.add(arr1[i]);
            }
            i++;
        }

        // If there are remaining elements in arr2, add them (skip duplicates)
        while (j < arr2.length) {
            if (unionResultList.get(unionResultList.size() - 1) != arr2[j]) {
                unionResultList.add(arr2[j]);
            }
            j++;
        }

        return unionResultList;
    }

    // Helper method to print an array
    static void printArray(String label, int[] array) {
        System.out.print(label);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line after array
    }

    // Main method to test the union logic
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // First sorted array
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};         // Second sorted array (contains duplicates)

        // Print input arrays
        printArray("Input Array 1: ", arr1);
        printArray("Input Array 2: ", arr2);

        // Get the union of both arrays
        ArrayList<Integer> unionResultList = findUnion(arr1, arr2);

        // Print the result
        System.out.println("Union of Array 1 and Array 2 is:");
        for (int val : unionResultList) {
            System.out.print(val + " ");
        }
    }
}