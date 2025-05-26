package com.prakash.striver_sde;

/**
 * @author prakashkaruppusamy
 */
 class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        // Step 1: Create helper arrays
        boolean[] rows = new boolean[rowCount];
        boolean[] cols = new boolean[colCount];

        // Step 2: Mark rows and columns that need to be zeroed
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 3: Set elements to zero based on marked rows and columns
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}