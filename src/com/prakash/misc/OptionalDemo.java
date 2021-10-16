package com.prakash.misc;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Integer v1 = null;
		Integer v2 = 10;

		Optional<Integer> a = Optional.ofNullable(v1);
		Optional<Integer> b = Optional.of(v2);

		Integer sum = calculateSum(a, b);
		System.out.println("Sum " + sum);

	}

	private static Integer calculateSum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First parameter is present : " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());

		return a.orElse(getNun()) + b.get();
	}

	private static Integer getNun() {
		System.out.println("orElse");
		return 5;
	}

}
