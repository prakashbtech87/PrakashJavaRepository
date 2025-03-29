package com.prakash.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prakashkaruppusamy
 * This class implements the FizzBuzz problem where:
 * - Numbers divisible by 3 are replaced with "Fizz".
 * - Numbers divisible by 5 are replaced with "Buzz".
 * - Numbers divisible by both 3 and 5 are replaced with "FizzBuzz".
 */
public class FizzBuzz {

    /**
     * Generates the FizzBuzz sequence for numbers from 1 to n.
     *
     * @param n The upper limit of the sequence.
     * @return A list of strings representing the FizzBuzz sequence.
     */
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz"); // If divisible by both 3 and 5, add "FizzBuzz"
            } else if (i % 3 == 0) {
                answer.add("Fizz"); // If divisible by 3, add "Fizz"
            } else if (i % 5 == 0) {
                answer.add("Buzz"); // If divisible by 5, add "Buzz"
            } else {
                answer.add(String.valueOf(i)); // Otherwise, add the number itself as a string
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(); // Creating an instance of FizzBuzz class

        // Test case 1: n = 3
        System.out.println("Test case 1 (n=3): " + fizzBuzz.fizzBuzz(3));
        // Expected Output: ["1", "2", "Fizz"]

        // Test case 2: n = 5
        System.out.println("Test case 2 (n=5): " + fizzBuzz.fizzBuzz(5));
        // Expected Output: ["1", "2", "Fizz", "4", "Buzz"]

        // Test case 3: n = 15
        System.out.println("Test case 3 (n=15): " + fizzBuzz.fizzBuzz(15));
        // Expected Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]
    }
}
