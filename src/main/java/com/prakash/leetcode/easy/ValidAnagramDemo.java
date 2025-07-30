package com.prakash.leetcode.easy;

/**
 * @author prakashkaruppusamy
 */
public class ValidAnagramDemo {
    /**
     * Checks if two strings are anagrams of each other.
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     *
     * @param s the first string
     * @param t the second string
     * @return true if the strings are anagrams, false otherwise
     * @throws NullPointerException if either string is null
     */
    public boolean isAnagram(String s, String t) {
        // Check for null inputs
        if (s == null || t == null) {
            throw new NullPointerException("Input strings cannot be null");
        }
        
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Create an array to count character frequencies
        int[] charCounts = new int[256]; // Extended ASCII
        
        // Count characters in first string (increment)
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i)]++;
        }
        
        // Decrement counts for characters in second string
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            charCounts[c]--;
            // If count goes negative, strings are not anagrams
            if (charCounts[c] < 0) {
                return false;
            }
        }
        
        return true;
    }
}
