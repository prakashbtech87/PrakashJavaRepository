package com.prakash.striver_sde.setmatrixtozero;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author prakashkaruppusamy
 */
public class BruteForceApproach {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<Integer>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<Integer>(Arrays.asList(1, 1, 1)));
        System.out.println("Original Mattix :");
        printMatrix(matrix);
       // markRow(matrix, 3, 3, 1);
        System.out.println();
        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> result = zeroMatrix(matrix, n, m);

        System.out.println("Final Matrix:");
        for (ArrayList<Integer> row : result) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }

    static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
        for (int j = 0; j < m; j++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(j) != 0) {
                matrix.get(i).set(j, -1);
            }
        }
    }

    // Main logic to set matrix zeros using brute-force approach
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Step 1: Mark rows and cols that contain 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }

        // Step 2: Convert all -1 to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }
}
