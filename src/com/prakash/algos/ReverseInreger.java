package com.prakash.algos;

public class ReverseInreger {

	public static void main(String[] args) {

		int n = 123456;
		int rev=0;
		System.out.println("N1 :" + n);
		
		while(n!=0) {
			rev=rev*10+n%10;
			n/=10;
		}

		System.out.println("N2 :" + rev);

	}

}
