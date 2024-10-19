package com.prakash.datastructure.javapatterns;

public class Pattern1 {
    

    public static void main(String[] args) {

        printPattern1(5);

    }

    public static void printPattern1(int n) {
        for (int outerloop = 0; outerloop < n; outerloop++) {
            for (int innerloop = 0; innerloop < n; innerloop++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

