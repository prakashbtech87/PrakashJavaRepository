package com.prakash.leetcode.easy;

/**
 * LeetCode 278. First Bad Version
 * https://leetcode.com/problems/first-bad-version/
 */
public class FirstBadVersion {
    
    // The isBadVersion API is defined in the parent class VersionControl.
    // boolean isBadVersion(int version);
    
    public int firstBadVersion(int n) {
        // Your implementation here
        return 0;
    }
    
    public static void main(String[] args) {
        // Test case
        int n = 10; // Example input
        FirstBadVersion solution = new FirstBadVersion();
        int result = solution.firstBadVersion(n);
        System.out.println("First bad version is: " + result);
    }
}
