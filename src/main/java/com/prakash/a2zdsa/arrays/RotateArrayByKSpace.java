package com.prakash.a2zdsa.arrays;

/**
 * Rotate an array to the right by k steps (in-place, O(1) space)
 * @author prakashkaruppusamy
 */
public class RotateArrayByKSpace {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Normalize k so that it doesn't exceed array length
        k = k % n;

        // Step 2: Reverse the entire array
        reverse(nums, 0, n - 1); // fixing here: full reverse

        // Step 3: Reverse the first k elements
        reverse(nums, 0, k - 1); // fixing here: reverse first k

        // Step 4: Reverse the remaining n - k elements
        reverse(nums, k, n - 1); // fixing here: reverse remaining
    }

    // Utility method to reverse a part of the array from index 'start' to index 'end'
    private void reverse(int[] nums, int start, int end) {
        // Continue swapping until start crosses end
        while (start < end) {
            // Store the value at 'start' in a temporary variable
            int temp = nums[start];
            // Copy the value at 'end' to the 'start' position
            nums[start] = nums[end];
            // Move the original 'start' value (from temp) to the 'end' position
            nums[end] = temp;
            // Move 'start' one step forward
            start++;
            // Move 'end' one step backward
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArrayByKSpace solution = new RotateArrayByKSpace();

        // ===============================
        // Test Case 1: Same array with k = 1
        // Expected Output: [7, 1, 2, 3, 4, 5, 6]
        // ===============================
        int[] nums1_1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 1;
        solution.rotate(nums1_1, k1);
        System.out.print("Test 1 - Rotated by " + k1 + ": ");
        for (int num : nums1_1) System.out.print(num + " ");
        System.out.println();

        // ===============================
        // Test Case 2: Same array with k = 3
        // Expected Output: [5, 6, 7, 1, 2, 3, 4]
        // ===============================
        int[] nums1_2 = {1, 2, 3, 4, 5, 6, 7};
        int k2 = 3;
        solution.rotate(nums1_2, k2);
        System.out.print("Test 2 - Rotated by " + k2 + ": ");
        for (int num : nums1_2) System.out.print(num + " ");
        System.out.println();

        // ===============================
        // Test Case 3: Same array with k = 7 (full rotation)
        // Expected Output: [1, 2, 3, 4, 5, 6, 7]
        // ===============================
        int[] nums1_3 = {1, 2, 3, 4, 5, 6, 7};
        int k3 = 7;
        solution.rotate(nums1_3, k3);
        System.out.print("Test 3 - Rotated by " + k3 + ": ");
        for (int num : nums1_3) System.out.print(num + " ");
        System.out.println();

        // ===============================
        // Test Case 4: Same array with k = 10 (normalized to 3)
        // Expected Output: [5, 6, 7, 1, 2, 3, 4]
        // ===============================
        int[] nums1_4 = {1, 2, 3, 4, 5, 6, 7};
        int k4 = 10;
        solution.rotate(nums1_4, k4);
        System.out.print("Test 4 - Rotated by " + k4 + ": ");
        for (int num : nums1_4) System.out.print(num + " ");
        System.out.println();
    }
}