package com.prakash.a2zdsa;

import java.util.Scanner;

/**
 * @author prakashkaruppusamy
 */
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scanner.nextInt();
        int ld = 0;
        int rev = 0;

        while (n > 0) {
            ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        System.out.println(rev);

    }
}
