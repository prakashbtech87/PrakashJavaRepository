package com.prakash.practice;

/**
 * @author prakashkaruppusamy
 */
public class CharArrayExampleAnagram {


    public static boolean isAnagram(String leftStr, String rightStr) {

        if (leftStr.length() != rightStr.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < leftStr.length(); i++) {
            count[leftStr.charAt(i) - 'a']++;
            count[rightStr.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        String s = "eat";
        String t = "ate";
        System.out.println(isAnagram(s, t));

    }
}
