
package com.prakash.datastructure.javapatterns;


public class Pattern10 {

    public static void main(String[] args) {
        printPattern(5);
    }


    public static void printPattern(int size) {
        // Loop over each row from 1 to 'size'
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
