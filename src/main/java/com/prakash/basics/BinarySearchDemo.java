package com.prakash.basics;

import java.util.Arrays;

public class BinarySearchDemo {

    public static void main(String[] args) {
        int a[] = {9, 6, 3, 8, 2, 20, 13};
        System.out.println("Before Sorting...");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        Arrays.sort(a);
        System.out.println("\nAfter Sorting...");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int target = 8;
        System.out.println("\nPerforming Binary Search for " + target);
        int position = binarySearch(a, target, 0, a.length - 1);
        if (position == -1) {
            System.out.println("Element " + target + " not found");
        } else {
            System.out.println("Element " + target + " found at " + position + " index ");
        }
    }

    private static int binarySearch(int[] a, int num, int low, int high) {
        while (low <= high) {

            int mid = (low + high) / 2;
            if (a[mid] == num) {
                return mid;
            }
            if (a[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


}
