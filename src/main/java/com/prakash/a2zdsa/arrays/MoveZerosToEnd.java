package com.prakash.a2zdsa.arrays;

/**
 * Move all zeros in the array to the end, while maintaining the order of non-zero elements.
 * This is done in-place with O(1) extra space.
 *
 * @author prakashkaruppusamy
 */
public class MoveZerosToEnd {

    /**
     * Shifts all 0s to the end of the array while keeping non-zero elements in their original order.
     *
     * @param n    Length of the array
     * @param nums Input array
     * @return     Modified array with zeros moved to the end
     */
    public static int[] moveZerosToEnd(int n, int[] nums) {
        int j = -1;

        // Step 1: Find the first zero in the array
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;  // Found the first zero index
                break;
            }
        }

        // If no zeros are found, return the array as is
        if (j == -1) return nums;

        // Step 2: Swap non-zero elements with position j and update j
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        // Test Case 1: Zeros in between
        int[] test1 = {1, 0, 2, 0, 3};
        printResult(test1, "Test Case 1 (Zeros in between)");

        // Test Case 2: All zeros
        int[] test2 = {0, 0, 0, 0};
        printResult(test2, "Test Case 2 (All zeros)");

        // Test Case 3: No zeros
        int[] test3 = {1, 2, 3, 4, 5};
        printResult(test3, "Test Case 3 (No zeros)");

        // Test Case 4: Zeros at start and end
        int[] test4 = {0, 1, 2, 0, 3, 0};
        printResult(test4, "Test Case 4 (Zeros at start and end)");
    }

    // Utility to print result of each test case with both "before" and "after"
    private static void printResult(int[] input, String label) {
        System.out.print(label + " (Before): ");
        for (int num : input) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Move zeros to end
        int[] result = moveZerosToEnd(input.length, input);

        // Print after moving zeros
        System.out.print(label + " (After): ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}