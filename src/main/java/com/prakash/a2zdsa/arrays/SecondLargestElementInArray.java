package com.prakash.a2zdsa.arrays;

import java.util.Arrays;

/**
 * This program finds the second smallest and second largest elements in an array.
 * It first prints the array before computing the results.
 *
 * @author prakashkaruppusamy
 */
class SecondLargestElementInArray {

    /**
     * Method to find the second smallest element in an array.
     * @param arr The input array
     * @param size The size of the array
     * @return The second smallest element, or -1 if not found
     */
    private static int findSecondSmallest(int[] arr, int size) {
        if (size < 2) {
            return -1; // Return -1 if there aren't enough elements to find the second smallest
        }
        int smallest = Integer.MAX_VALUE; // Initialize smallest with the highest possible value
        int secondSmallest = Integer.MAX_VALUE; // Initialize second smallest with the highest possible value

        for (int num : arr) { // Iterate through each element in the array
            if (num < smallest) { // If the current element is smaller than the smallest
                secondSmallest = smallest; // Update second smallest
                smallest = num; // Update smallest
            } else if (num < secondSmallest && num != smallest) { // If the current element is smaller than secondSmallest but not equal to smallest
                secondSmallest = num; // Update secondSmallest
            }
        }
        return (secondSmallest == Integer.MAX_VALUE) ? -1 : secondSmallest; // Return secondSmallest if found, else return -1
    }

    /**
     * Method to find the second largest element in an array.
     * @param arr The input array
     * @param size The size of the array
     * @return The second largest element, or -1 if not found
     */
    private static int findSecondLargest(int[] arr, int size) {
        if (size < 2) {
            return -1; // Return -1 if there aren't enough elements to find the second largest
        }
        int largest = Integer.MIN_VALUE; // Initialize largest with the lowest possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize second largest with the lowest possible value

        for (int num : arr) { // Iterate through each element in the array
            if (num > largest) { // If the current element is larger than the largest
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) { // If the current element is greater than secondLargest but not equal to largest
                secondLargest = num; // Update secondLargest
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest; // Return secondLargest if found, else return -1
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 7, 7, 5}; // Input array
        int size = numbers.length; // Get the size of the array

        // Print the original array before finding second smallest and second largest elements
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Find and print the second smallest and second largest numbers
        int secondSmallest = findSecondSmallest(numbers, size); // Call method to find second smallest
        int secondLargest = findSecondLargest(numbers, size); // Call method to find second largest

        // Print results
        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Second largest element: " + secondLargest);
    }
}
