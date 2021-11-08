package com.prakash.performance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrimeNumber {

	private List<Integer> primes;

	private Boolean isPrime(Integer testNumber) {
		for (int i = 2; i < testNumber; i++) {
			if (testNumber % i == 0)
				return false;
		}
		return true;
	}

	private Integer getNextPrimeAbove(Integer previous) {
		Integer testNumber = previous + 1;
		while (!isPrime(testNumber)) {
			testNumber++;
		}
		return testNumber;
	}

	public void generateNumbers(Integer max) {
		primes = new ArrayList<Integer>();
		primes.add(2);

		Integer next = 2;
		while (primes.size() <= max) {
			next = getNextPrimeAbove(next);
			primes.add(next);
		}
		System.out.println(primes);
	}

	public static void main(String[] args) throws InterruptedException {
		PrimeNumber primeNumbers = new PrimeNumber();
		Integer max = Integer.parseInt("100");
		Date start = new Date();
		primeNumbers.generateNumbers(max);
		Date end = new Date();
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) + " ms.");

	}

}
