package com.prakash.a2zdsa.arrays;

/**
 * @author Prakash Karuppusamy
 */
public class CheckArrayIfSortedAndRotated {

    public boolean check(int[] nums) {
        int len = nums.length;
        int deviations = 0; // Counts the number of places where order is broken

        for (int i = 0; i < len; i++) {
            // Check if the current element is greater than the next element
            if (i < len - 1 && nums[i] > nums[i + 1]) {
                deviations++;
            }
            // Check for the last element compared with the first element (circular check)
            else if (i == len - 1 && nums[len - 1] > nums[0]) {
                deviations++;
            }
        }

        // If there is more than one deviation, it is not sorted and rotated
        return deviations <= 1;
    }

    public static void main(String[] args) {
        CheckArrayIfSortedAndRotated checker = new CheckArrayIfSortedAndRotated();

        // Test case 1: Sorted and rotated
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Test case 1: " + checker.check(nums1)); // Expected output: true

        // Test case 2: Not sorted and rotated
        int[] nums2 = {2, 1, 3, 4, 5};
        System.out.println("Test case 2: " + checker.check(nums2)); // Expected output: false

        // Test case 3: Already sorted (edge case)
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Test case 3: " + checker.check(nums3)); // Expected output: true
    }
}