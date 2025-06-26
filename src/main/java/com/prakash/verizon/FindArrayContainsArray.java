package com.prakash.verizon;

public class FindArrayContainsArray {

    public static void main(String[] args) {

        int firstArr[] = {3, 6, 10, 5, 2, 9, 5, 10, 0, 6};
        int secndArr[] = {10, 5, 2};

        boolean allFound = true;

        for (int j = 0; j < secndArr.length; j++) {
            boolean found = false;
            for (int i = 0; i < firstArr.length; i++) {
                if (secndArr[j] == firstArr[i]) {
                    found = true;
                    break; // no need to search further in firstArr
                }
            }
            if (!found) {
                allFound = false;
                System.out.println(secndArr[j] + " is NOT present in firstArr");
            } else {
                System.out.println(secndArr[j] + " is present in firstArr");
            }
        }

        if (allFound) {
            System.out.println("✅ All elements of secndArr are present in firstArr");
        } else {
            System.out.println("❌ Some elements of secndArr are missing in firstArr");
        }
    }
}