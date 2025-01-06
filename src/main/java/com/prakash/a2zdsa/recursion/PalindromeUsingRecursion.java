package com.prakash.a2zdsa.recursion;

/**
 * This class provides a method to check if a given string is a palindrome using recursion.
 * A palindrome is a word, phrase, or sequence that reads the same backward as forward.
 *
 * @author prakashkaruppusamy
 */
public class PalindromeUsingRecursion {

    /**
     * Recursive method to check if a string is a palindrome.
     *
     * @param i The current index being checked (starting from 0).
     * @param s The string to check for palindrome property.
     * @return true if the string is a palindrome, false otherwise.
     */
    static boolean isPalindrome(int i, String s) {
        // Base case: If the index reaches the middle, the string is a palindrome.
        if (i >= s.length() / 2) {
            return true;
        }

        // Check if the characters at the current index and its corresponding index
        // from the end are equal. If not, the string is not a palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        // Recursive case: Move to the next pair of characters.
        return isPalindrome(i + 1, s);
    }

    public static void main(String[] args) {
        // Input string to check for palindrome property.
        String s = "MALAYALAM";

        // Convert the string to lowercase to make the palindrome check case-insensitive.
        String lowerCaseString = s.toLowerCase();

        // Call the recursive method and print the result.
        System.out.println("Is the string \"" + s + "\" a palindrome? " + isPalindrome(0, lowerCaseString));
    }
}