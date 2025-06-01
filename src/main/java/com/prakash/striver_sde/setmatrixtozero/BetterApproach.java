package com.prakash.striver_sde.setmatrixtozero;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author prakashkaruppusamy
 */
public class BetterApproach {

    public static ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Arrays to mark the rows and columns that need to be zeroed
        int[] row = new int[n];
        int[] col = new int[m];

        // Step 1: Mark the rows and columns that contain at least one zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = 1; // Mark the row
                    col[j] = 1; // Mark the column
                }
            }
        }

        // Step 2: Set the matrix elements to zero where the row or column is marked
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0); // Set element to 0
                }
            }
        }

        return matrix;
    }

    // Utility method to print the matrix
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test Case 1: 3x3 Matrix
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        matrix1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix1.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix1.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        System.out.println("Test Case 1 - 3x3 Input:");
        printMatrix(matrix1);
        ArrayList<ArrayList<Integer>> result1 = setZeroes(matrix1, 3, 3);
        System.out.println("Output:");
        printMatrix(result1);

        // Test Case 2: 4x4 Matrix
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        matrix2.add(new ArrayList<>(Arrays.asList(0, 2, 3, 4)));
        matrix2.add(new ArrayList<>(Arrays.asList(5, 6, 0, 8)));
        matrix2.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        matrix2.add(new ArrayList<>(Arrays.asList(13, 14, 15, 0)));

        System.out.println("\nTest Case 2 - 4x4 Input:");
        printMatrix(matrix2);
        ArrayList<ArrayList<Integer>> result2 = setZeroes(matrix2, 4, 4);
        System.out.println("Output:");
        printMatrix(result2);
    }
}