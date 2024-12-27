package com.prakash.a2zdsa;

/**
 * @author prakashkaruppusamy
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }

    static boolean armstrongNumber(int n) {
        int val = 0;
        int dupN = n;

        while (n > 0) {
            int lastDigit = n % 10;
            val = val + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        return dupN == val;
    }
}
