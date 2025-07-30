package com.prakash.leetcode.codeio;

/**
 * @author prakashkaruppusamy
 */

class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        s = s.stripTrailing();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return count;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}