package com.prakash.a2zdsa.sorting;

import java.util.ArrayList;

/**
 * Implementation of Merge Sort Algorithm
 *
 * Merge Sort is a divide-and-conquer algorithm that recursively splits the array into two halves,
 * sorts each half, and then merges them back together.
 *
 * @author Prakash Karuppusamy
 */
public class MergeSort {

    /**
     * Recursive function to perform Merge Sort on an array.
     *
     * @param arr  The array to be sorted
     * @param low  The starting index of the portion to be sorted
     * @param high The ending index of the portion to be sorted
     */
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return; // Base case: if the sub-array has one or zero elements, it's already sorted

        int mid = (low + high) / 2; // Finding the middle index

        mergeSort(arr, low, mid);      // Recursively sort the left half
        mergeSort(arr, mid + 1, high); // Recursively sort the right half

        merge(arr, low, mid, high); // Merge the two sorted halves
    }

    /**
     * Merges two sorted subarrays into a single sorted subarray.
     *
     * @param arr  The original array containing both subarrays
     * @param low  The starting index of the first subarray
     * @param mid  The middle index separating the two subarrays
     * @param high The ending index of the second subarray
     */
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // Temporary list to store merged values

        int left = low;     // Starting index for the left subarray
        int right = mid + 1; // Starting index for the right subarray

        // Compare elements of both subarrays and merge them in sorted order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy any remaining elements from the left subarray
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Copy any remaining elements from the right subarray
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy sorted elements from temp list back to the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    /**
     * Main method to test Merge Sort algorithm
     */
    public static void main(String[] args) {
        int arr[] = {9, 4, 7, 6, 3, 1, 5}; // Sample array

        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Calling mergeSort on the entire array
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}