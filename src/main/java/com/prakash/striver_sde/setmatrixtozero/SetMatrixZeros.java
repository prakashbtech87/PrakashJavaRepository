package com.prakash.striver_sde.setmatrixtozero;

import java.util.*;

/**
 * @author prakashkaruppusamy
 *
 * ✅ Problem: Set Matrix Zeroes
 * 🔍 If any cell in the matrix is 0, we set its entire row and column to 0.
 *
 * ✅ Approach:
 * 1. First pass: Remember all rows and columns that have a 0.
 * 2. Second pass: Update the remembered rows and columns to 0.
 */
class SetMatrixZeroes {

 // ✅ Function to modify the matrix
 public static void setZeroes(int[][] matrix) {
  int rowCount = matrix.length;        // total number of rows
  int colCount = matrix[0].length;     // total number of columns

  // Step 1: Create sets to store rows and columns that need to be zeroed
  Set<Integer> zeroRows = new HashSet<>();
  Set<Integer> zeroCols = new HashSet<>();

  // Step 2: First pass — find all cells that are 0
  for (int row = 0; row < rowCount; row++) {
   for (int col = 0; col < colCount; col++) {
    if (matrix[row][col] == 0) {
     // Remember the row and column index
     zeroRows.add(row);
     zeroCols.add(col);
    }
   }
  }

  // Step 3: Set entire rows to 0
  for (int row : zeroRows) {
   for (int col = 0; col < colCount; col++) {
    matrix[row][col] = 0;
   }
  }

  // Step 4: Set entire columns to 0
  for (int col : zeroCols) {
   for (int row = 0; row < rowCount; row++) {
    matrix[row][col] = 0;
   }
  }
 }

 // ✅ Helper function to print the matrix
 public static void printMatrix(int[][] matrix) {
  for (int[] row : matrix) {
   System.out.println(Arrays.toString(row));
  }
 }

 // ✅ Main method to test the function
 public static void main(String[] args) {
  int[][] matrix = {
          {1, 2, 3},
          {4, 0, 6},
          {7, 8, 9}
  };

  System.out.println("Before:");
  printMatrix(matrix);

  setZeroes(matrix); // Call the main logic

  System.out.println("After:");
  printMatrix(matrix);
 }
}