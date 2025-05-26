package com.prakash.practice;

/**
 * @author prakashkaruppusamy
 */
public class Arrayzz {

    static int arr[] = {3, 1, 7, 4, 6, 2, 0, 8, 5};

    public static void main(String[] args) {

        System.out.println("Array Elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n--- Array Info ---");

        // TODO 1: Print the length of the array
        // Hint: Use arr.length
        // Example: System.out.println("Length: " + arr.length);
        System.out.println("Array Length :" + arr.length);

        // TODO 2: Find max element in the array
        // Hint: Start with max = arr[0], then loop and compare each value to max
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max is :" + max);
        // TODO 3: Find min element in the array
        // Hint: Start with min = arr[0], then loop and compare each value to min
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min is :" + min);

        // TODO 4: Find the sum of all elements
        // Hint: Use a variable sum = 0 and add each element in a loop
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is :" + sum);
    }
}