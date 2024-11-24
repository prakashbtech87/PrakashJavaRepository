package com.prakash.javacoding;

import java.util.PriorityQueue;

public class MinimizeArraySum {
    public static void main(String[] args) {
        // This is the input list of numbers and the number of operations we need to perform
        int[] nums = {10, 20, 7};
        int k = 4;

        // Find the smallest possible sum after performing operations
        int minimizedSum = minimizeSum(nums, k);

        // Print the final minimized sum
        System.out.println("Minimized Sum: " + minimizedSum);
    }

    /**
     * This method minimizes the sum of the array.
     *
     * @param nums The input array of numbers.
     * @param k    The number of operations to perform.
     * @return The minimized sum after k operations.
     */
    public static int minimizeSum(int[] nums, int k) {
        // Step 1: Create a "basket" where the largest number is always on top.
        // A PriorityQueue in Java is like a smart basket that keeps items sorted.
        // We configure it to always keep the biggest number on top.
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Step 2: Add all numbers from the array into the basket.
        for (int num : nums) {
            maxHeap.add(num); // Put each number into the basket.
        }

        // Step 3: Perform the operation 'k' times.
        for (int i = 0; i < k; i++) {
            // Take out the largest number (at the top of the basket)
            int largest = maxHeap.poll();

            /* Example:
             * If the basket has [20, 10, 7],
             * "poll" will take out 20.
             */

            // Divide the number by 2 and round it up to the nearest whole number
            int reduced = (int) Math.ceil(largest / 2.0);

            /* Example:
             * If the number is 20:
             * 20 / 2 = 10 (already a whole number, so no change).
             * If the number is 7:
             * 7 / 2 = 3.5 --> rounded up to 4.
             */

            // Put the reduced number back into the basket
            maxHeap.add(reduced);

            /* Example:
             * If the basket now has [10, 10, 7]:
             * After removing 10, reducing it to 5, and adding it back:
             * The basket becomes [10, 7, 5].
             */
        }

        // Step 4: Add up all the numbers left in the basket.
        int sum = 0;
        while (!maxHeap.isEmpty()) { // Keep taking numbers until the basket is empty
            sum += maxHeap.poll(); // Add the numbers to get the total
        }

        /* Example:
         * If the remaining numbers are [5, 5, 4]:
         * The final sum is 5 + 5 + 4 = 14.
         */

        // Return the minimized total sum
        return sum;
    }
}