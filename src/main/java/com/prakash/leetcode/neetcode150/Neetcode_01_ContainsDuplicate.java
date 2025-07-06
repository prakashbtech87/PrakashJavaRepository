package com.prakash.leetcode.neetcode150;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author prakashkaruppusamy
 */
public class Neetcode_01_ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] = {1, 5, 3, 8, 2, 9, 2};
        System.out.println("Contains Duplicate :" + containsDuplicate(arr));
    }
}
