package com.prakash.a2zdsa.maths;

/**
 * @author prakashkaruppusamy
 */

public class GCDorHCF {

    public static void main(String[] args) {
        System.out.println(gcd(12, 46));
    }

    public static int gcd(int a, int b) {
        // Loop until one of the numbers becomes zero
        while (a > 0 && b > 0) {
            if (a > b) {
                // If 'a' is greater than 'b', replace 'a' with the remainder of a divided by b
                a = a % b;
            } else {
                // Otherwise, replace 'b' with the remainder of b divided by a
                b = b % a;
            }
        }
        // When one of the numbers becomes zero, the other number is the GCD
        return (a == 0) ? b : a;
    }
}