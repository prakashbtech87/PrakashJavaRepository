package com.prakash.a2zdsa.arrays;

/**
 * @author prakashkaruppusamy
 */
public class LargestElement {

    /**
     * This method finds the largest element in an array.
     * @param arr - input integer array
     * @return the largest element in the array
     */
    public static int largest(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 5, 8, 30};
        System.out.println("Largest element in arr1: " + largest(arr1)); // Expected output: 30

        int[] arr2 = {-5, -1, -10, -20};
        System.out.println("Largest element in arr2: " + largest(arr2)); // Expected output: -1

        int[] arr3 = {7, 3, 7, 1, 7};
        System.out.println("Largest element in arr3: " + largest(arr3)); // Expected output: 7
    }
}