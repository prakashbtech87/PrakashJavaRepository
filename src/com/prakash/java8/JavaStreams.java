package com.prakash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 10, 15, 24, 25, 36, 45, 100, 101, 202);
		// please print only even numbers which are divisble by 5 using JAVA 8 STREAMS API
		List<Integer> newNumbers = numbers.stream().filter(n -> n % 10 == 0).collect(Collectors.toList());
		System.out.println(newNumbers);

	}

}
