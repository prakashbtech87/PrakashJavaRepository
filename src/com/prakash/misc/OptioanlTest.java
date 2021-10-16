package com.prakash.misc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class OptioanlTest {

	@Test
	public void orElseTest() {
		String result =  Optional.of("hello").orElse(someMethod());
		String result1 = Optional.of("hello").orElseGet(() -> someMethod());
		assertEquals(result, "hello");
		assertEquals(result1, "hello");

	}

	private String someMethod() {
		System.out.println("I am running !!");
		return "hola";
	}

}
