package com.prakash.algos;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterInString {

	public static void charCount(String str) {

		Map<Character, Integer> charCountMap = new HashMap<>();

		char[] charArray = str.toCharArray();

		for (char c : charArray) {

			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		System.out.println("Start Of Main");
		OccurenceOfCharacterInString.charCount("Java");
		System.out.println("End Of Main");
	}

}
