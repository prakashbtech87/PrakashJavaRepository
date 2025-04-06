package com.prakash.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Zigzag Conversion Problem
 * Converts a given string into a zigzag pattern and reads it row by row
 *
 * Example:
 * Input: "PAYPALISHIRING", numRows = 3
 * Zigzag Form:
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * Output: "PAHNAPLSIIGYIR"
 *
 * @author prakashkaruppusamy
 */
public class ZigzagConversion {

    /**
     * Converts the input string into zigzag pattern based on the number of rows
     *
     * @param s       Input string
     * @param numRows Number of zigzag rows
     * @return Zigzag-converted string
     */
    public static String convert(String s, int numRows) {
        // Special case: if only 1 row, return original string
        if (numRows == 1) {
            return s;
        }

        // Create a list of StringBuffer (one for each row)
        List<StringBuffer> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuffer());
        }

        int currentRow = 0;        // Start at the first row
        boolean goingDown = false; // Flag to indicate direction

        // Traverse each character in the input string
        for (char c : s.toCharArray()) {
            // Append current character to the current row
            rows.get(currentRow).append(c);

            // Change direction if we're at the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows to get the final result
        StringBuilder result = new StringBuilder();
        for (StringBuffer row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Test 1: " + convert("PAYPALISHIRING", 3));
        // Expected: PAHNAPLSIIGYIR

        // Test Case 2
        System.out.println("Test 2: " + convert("PAYPALISHIRING", 4));
        // Expected: PINALSIGYAHRPI

        // Test Case 3
        System.out.println("Test 3: " + convert("A", 1));
        // Expected: A

        // Test Case 4
        System.out.println("Test 4: " + convert("ABCD", 2));
        // Expected: ACBD

        // Test Case 5
        System.out.println("Test 5: " + convert("HELLOZIGZAG", 5));
        // Expected: HZELOAGLIG

        // You can add more custom test cases to practice
    }
}