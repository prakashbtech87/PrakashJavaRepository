package com.prakash.a2zdsa.recursion;

/**
 * @author prakashkaruppusamy
 */
public class PalindromeUsingRecursion {

    static boolean isPalindrome(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.indexOf(i) != s.indexOf(s.length() - i - 1)) {
            return false;
        }
        return isPalindrome(i + 1, s);

    }

    public static void main(String[] args) {

        String s = "MALAYALAM";
        System.out.println(isPalindrome(0, s));
    }
}
