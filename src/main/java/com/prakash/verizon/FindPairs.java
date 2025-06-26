package com.prakash.verizon;

import java.util.HashMap;
import java.util.Scanner;

public class FindPairs {

    public static void main(String[] args) {
        int[] arr1 = {3, 6, 10, 5, 2, 9, 5, 10, 0, 6};
        int target = 9;

        Scanner scanner = new Scanner(System.in);
        System.out.println("🛠️ Choose a mode:");
        System.out.println("1. Use HashMap (Optimized O(n))");
        System.out.println("2. Use Brute-Force (O(n^2))");
        System.out.println("3. Run Both and Compare Execution Time");

        System.out.print("👉 Enter 1, 2, or 3: ");
        int mode = scanner.nextInt();

        switch (mode) {
            case 1:
                System.out.println("🔍 Using HashMap (Optimized O(n)) Approach");
                findPairsWithHashMap(arr1, target);
                break;
            case 2:
                System.out.println("🔍 Using Brute-Force (O(n^2)) Approach");
                findPairsWithoutCollection(arr1, target);
                break;
            case 3:
                compareExecutionTime(arr1, target);
                break;
            default:
                System.out.println("❌ Invalid input. Please enter 1, 2, or 3.");
        }

        scanner.close();
    }

    // ✅ Option 1: HashMap based solution
    public static void findPairsWithHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("✅ Pair: " + map.get(complement) + ", " + i +
                        " -> " + complement + " + " + arr[i]);
            }
            map.put(arr[i], i);
        }
    }

    // ✅ Option 2: Brute-force solution
    public static void findPairsWithoutCollection(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("✅ Pair: " + i + ", " + j +
                            " -> " + arr[i] + " + " + arr[j]);
                }
            }
        }
    }

    // ✅ Option 3: Compare execution time
    public static void compareExecutionTime(int[] arr, int target) {
        long startWith = System.nanoTime();
        findPairsWithHashMap(arr, target);
        long endWith = System.nanoTime();
        System.out.println("⏱️ Time using HashMap: " + (endWith - startWith) / 1_000_000.0 + " ms");

        System.out.println();

        long startWithout = System.nanoTime();
        findPairsWithoutCollection(arr, target);
        long endWithout = System.nanoTime();
        System.out.println("⏱️ Time using Brute-Force: " + (endWithout - startWithout) / 1_000_000.0 + " ms");
    }
}