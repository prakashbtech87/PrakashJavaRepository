package com.prakash.leetcode.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramDemoTest {
    private final ValidAnagramDemo solution = new ValidAnagramDemo();

    @Test
    void testIsAnagram() {
        // Test case 1: Basic anagram
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        
        // Test case 2: Not an anagram
        assertFalse(solution.isAnagram("rat", "car"));
        
        // Test case 3: Empty strings
        assertTrue(solution.isAnagram("", ""));
        
        // Test case 4: Single character
        assertTrue(solution.isAnagram("a", "a"));
        
        // Test case 5: Different lengths
        assertFalse(solution.isAnagram("abc", "ab"));
        
        // Test case 6: Same string
        assertTrue(solution.isAnagram("listen", "listen"));
        
        // Test case 7: Anagrams with spaces
        assertTrue(solution.isAnagram("the eyes", "they see"));
        
        // Test case 8: Case sensitivity
        assertFalse(solution.isAnagram("Hello", "hello"));
        
        // Test case 9: Numbers in string
        assertTrue(solution.isAnagram("a1b2c3", "c3b2a1"));
        
        // Test case 10: Special characters
        assertTrue(solution.isAnagram("a!@#$", "@$#a!"));
        
        // Test case 11: Long anagram
        assertTrue(solution.isAnagram("abcdefghijklmnopqrstuvwxyz", "zyxwvutsrqponmlkjihgfedcba"));
            
        // Test case 12: Repeated characters
        assertTrue(solution.isAnagram("aabbcc", "abcabc"));
        
        // Test case 13: Unicode characters
        assertTrue(solution.isAnagram("café", "éfac"));
        
        // Test case 14: One empty string
        assertFalse(solution.isAnagram("", "notempty"));
        
        // Test case 15: Null input
        try {
            solution.isAnagram(null, "test");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
}
