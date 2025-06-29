package com.prakash.practice;

/**
 * @author prakashkaruppusamy
 */
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str1 = "apple";

        // This line creates a frequency map
        Map<Character, Long> frequencyMap1 = str1.chars()                  // Step 1: Stream of int (ASCII)
                .mapToObj(c -> (char) c)                                   // Step 2: Convert int to char
                .collect(Collectors.groupingBy(                            // Step 3: Group same chars
                        Function.identity(),                               // Key = character
                        Collectors.counting()                              // Value = count
                ));

        System.out.println("Character Frequency Map: " + frequencyMap1);
    }
}