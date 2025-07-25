package com.prakash.striver_sde.setmatrixtozero;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Optimal in-place solution for Set Matrix Zero problem using constant space.
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 *
 * @author prakashkaruppusamy
 */
public class OptimalSolution {

    public static ArrayList<ArrayList<Integer>> setMatrixZero(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int col0 = 1; // To track if the first column should be zeroed

        // Step 1: Use first row and first column as markers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0); // Mark row
                    if (j != 0)
                        matrix.get(0).set(j, 0); // Mark column
                    else
                        col0 = 0; // First column needs to be zeroed
                }
            }
        }

        // Step 2: Set matrix[i][j] to 0 if row or column is marked
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        // Step 3: Zero the first row if needed
        if (matrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        // Step 4: Zero the first column if needed
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }

    // Sample main method to test the logic
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> result = setMatrixZero(matrix, n, m);

        System.out.println("Final matrix:");
        for (ArrayList<Integer> row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}