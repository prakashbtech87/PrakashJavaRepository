package com.prakash.javacoding;

public class LinearSearch {

    public static void main(String[] args) {
        int a[] = {3, 8, 12, 6, 10, 2};
        int position = linearSearch(a, 6);
        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + position + " index ");
        }
    }

    private static int linearSearch(int[] a, int num ) {
        for (int index = 0; index < a.length; index++) {
            if (num == a[index]) {
                return index;
            }
        }
        return -1;
    }


}
