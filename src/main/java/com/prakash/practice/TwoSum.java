package com.prakash.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author prakashkaruppusamy
 */
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 6, 8, 10};
        int target = 14;
        System.out.println("Main Example:");
        findTwoSum(arr, target);

        System.out.println("\nExample 1:");
        findTwoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println("\nExample 2:");
        findTwoSum(new int[]{3, 2, 4}, 6);

        System.out.println("\nExample 3:");
        findTwoSum(new int[]{3, 3}, 6);

        System.out.println("\nExample 4:");
        findTwoSum(new int[]{1, 2, 3, 4, 5}, 8);

        System.out.println("\nExample 5:");
        findTwoSum(new int[]{10, 20, 30, 40}, 50);

        System.out.println("\nExample 6:");
        findTwoSum(new int[]{5, 1, 7, 9}, 316);
    }

    public static void findTwoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();  // Changed

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];  // Changed
            if (map.containsKey(complement)) {
                System.out.println("found the array [" + i + "," + map.get(complement) + "]");  // Kept as-is
                return;
            }
            map.put(arr[i], i);  // Changed
        }

        System.out.println("not found in the array");
    }
}