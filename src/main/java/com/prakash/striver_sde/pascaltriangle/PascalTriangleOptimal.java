import java.util.*;

public class PascalTriangleOptimal {

    /**
     * This method generates a single row of Pascal's Triangle
     * For example, if row = 4, it returns [1, 3, 3, 1]
     */
    public static List<Integer> generateRow(int row) {
        long ans = 1;  // First number in every row is 1
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); // Add the first 1 to the row

        // Now calculate the rest of the numbers in this row
        // Formula used: next = previous * (row - col) / col
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);  // numerator
            ans = ans / col;          // denominator
            ansRow.add((int) ans);    // add to the row list
        }

        return ansRow; // return this full row
    }

    /**
     * This method builds Pascal's Triangle up to n rows
     * It calls generateRow() for each row
     */
    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        // Build each row from 1 to n
        for (int row = 1; row <= n; row++) {
            List<Integer> currentRow = generateRow(row); // generate that row
            ans.add(currentRow); // add to triangle list
        }

        return ans; // return full triangle
    }

    /**
     * Main method to test the triangle printing
     */
    public static void main(String[] args) {
        int n = 5; // How many rows you want
        List<List<Integer>> triangle = pascalTriangle(n); // build triangle

        // Print each row
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " "); // print number with space
            }
            System.out.println(); // new line for next row
        }
    }
}