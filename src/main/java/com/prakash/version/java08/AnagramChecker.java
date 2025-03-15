package com.prakash.version.java08; // Package declaration

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author prakashkaruppusamy
 * This class checks if two strings are anagrams using frequency count.
 */
public class AnagramChecker {

    /**
     * Method to check if two strings are anagrams using frequency counting.
     * An anagram means both words have the same characters with the same frequency.
     *
     * @param str1 First string to compare
     * @param str2 Second string to compare
     * @return true if both strings are anagrams, false otherwise
     */
    public static boolean areAnagramUsingFrequency(String str1, String str2) {

        // Step 1: If the lengths of both strings are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Convert both strings into frequency maps
        // A map that stores each character as a key and its count as a value

        Map<Character, Long> frequencyMap1 = str1.chars() // Convert the string to a stream of characters
                .mapToObj(c -> (char) c) // Convert intStream (ASCII values) to Character objects
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Group by character and count occurrences


        Map<Character, Long> frequencyMap2 = str2.chars() // Convert the second string to a character stream
                .mapToObj(c -> (char) c) // Convert ASCII values to Character objects
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Group by character and count occurrences

        // Step 3: Compare the two frequency maps
        return frequencyMap1.equals(frequencyMap2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Calling the anagram method and storing the result
        boolean result = areAnagramUsingFrequency(str1, str2);

        // Printing the result
        System.out.println(str1 + " and " + str2 + " are anagrams: " + result);
    }
}