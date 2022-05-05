package com.prakash.misc;

import java.io.IOException;

public class TaxCalculation {

	public static void main(String[] args) {
		double total = 222.0;
		double cost = 800.0;
		double received = 147.0;
		double tax = 10.0 / 100.0;// 0.1
		double actual = total - received;// 116-66=50
		double expected = actual * cost;

		if (true) {
			expected = expected - expected * tax;
		}
		
		System.out.println("Total interviews taken so far.........==>" + total);
		System.out.println("Cost per interview....................==>" + cost);
		System.out.println("Tax ..................................==>" + tax);
		System.out.println("Actual interview count for payment....==>" + actual);
		System.out.println("Actual payment amount to be processed.==>" + expected);

	}

}
