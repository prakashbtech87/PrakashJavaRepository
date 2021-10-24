package com.prakash.algos;

public class ReverseInreger {

	public static void main(String[] args) {

		int num = 123456;
		System.out.println("N1 :" + num);
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}

		System.out.println("N2 :" + rev);

	}

}
