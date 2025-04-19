import java.util.*;

/**
 * Author: Prakash Karuppusamy
 *
 * Description:
 * This Java program finds the **union** of two sorted arrays.
 * The union of two arrays includes all distinct elements from both arrays in sorted order.
 * This implementation uses the two-pointer technique to avoid duplicates and ensure efficiency.
 *
 * Approach:
 * 1. Traverse both arrays using two pointers.
 * 2. Compare elements and add them to the result list if not already added.
 * 3. After one array is fully traversed, continue adding remaining elements from the other array (if any), avoiding duplicates.
 */

class UnionOfArray {

    // Method to find union of two sorted arrays
    static ArrayList<Integer> findUnion(int arr1[], int arr2[]) {
        int i = 0, j = 0; // Initialize pointers for both arrays
        ArrayList<Integer> unionResultList = new ArrayList<>(); // List to store the final union result

        // Traverse both arrays simultaneously
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (unionResultList.size() == 0 || unionResultList.get(unionResultList.size() - 1) != arr1[i])
                    unionResultList.add(arr1[i]);
                i++;
            } else {
                if (unionResultList.size() == 0 || unionResultList.get(unionResultList.size() - 1) != arr2[j])
                    unionResultList.add(arr2[j]);
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.length) {
            if (unionResultList.get(unionResultList.size() - 1) != arr1[i])
                unionResultList.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            if (unionResultList.get(unionResultList.size() - 1) != arr2[j])
                unionResultList.add(arr2[j]);
            j++;
        }

        return unionResultList;
    }

    // Main method to test the union logic
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // First sorted array
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};         // Second sorted array (contains duplicates)

        // Call the findUnion method
        ArrayList<Integer> unionResultList = findUnion(arr1, arr2);

        // Print the union result
        System.out.println("Union of arr1 and arr2 is:");
        for (int val : unionResultList)
            System.out.print(val + " ");
    }
}