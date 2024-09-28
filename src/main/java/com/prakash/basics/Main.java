package com.prakash.basics;

/**
 * @author prakashkaruppusamy
 */
public class Main {
    public static void main(String[] args) {
        int marks[] = {10, 10, 10};
        int average = getSum(marks) / 3;
        System.out.println(average);
    }

    static int getSum(int[] marks) {
        int result = 0;
        for (int i = 1; i < 3; i++) {
            result = result + marks[i];
        }
        return result;
    }
}
