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
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // Initialize pointers for both arrays
        ArrayList<Integer> Union = new ArrayList<>(); // List to store the final union result

        // Traverse both arrays simultaneously
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) { // Case 1 and 2: arr1[i] is less than or equal to arr2[j]
                // Add to Union list only if it's not already the last added element
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; // Move pointer in arr1
            } else { // Case 3: arr2[j] is smaller than arr1[i]
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++; // Move pointer in arr2
            }
        }

        // Add remaining elements from arr1, if any
        while (i < n) {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2, if any
        while (j < m) {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        return Union;
    }

    // Main method to test the union logic
    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // First sorted array
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};         // Second sorted array (contains duplicates)

        // Call the FindUnion method
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);

        // Print the union result
        System.out.println("Union of arr1 and arr2 is: ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}