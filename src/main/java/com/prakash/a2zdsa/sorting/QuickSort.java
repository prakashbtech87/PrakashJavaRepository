package com.prakash.a2zdsa.sorting;

import java.util.*;

/**
 * QuickSort implementation
 * @author Prakash Karuppusamy
 */
public class QuickSort {

    /**
     * Partition function to place the pivot element at its correct position.
     * It rearranges the array such that elements smaller than pivot are on the left,
     * and elements greater than pivot are on the right.
     */
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low); // Choosing first element as pivot
        int i = low;
        int j = high;

        while (i < j) {
            // Find an element larger than pivot from left side
            while (i < high && arr.get(i) <= pivot) {
                i++;
            }
            // Find an element smaller than pivot from right side
            while (j > low && arr.get(j) > pivot) {
                j--;
            }
            // Swap elements if they are in the wrong order
            if (i < j) {
                Collections.swap(arr, i, j);
            }
        }
        // Swap pivot with the correct position
        Collections.swap(arr, low, j);
        return j;
    }

    /**
     * Recursive QuickSort function.
     */
    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1); // Recursively sort left sub-array
            qs(arr, pIndex + 1, high); // Recursively sort right sub-array
        }
    }

    /**
     * Public method to call QuickSort.
     */
    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }

    /**
     * Main method to test QuickSort.
     */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3));

        System.out.println("Before QuickSort: " + arr);

        // Sorting the array
        arr = quickSort(arr);

        System.out.println("After QuickSort: " + arr);
    }
}