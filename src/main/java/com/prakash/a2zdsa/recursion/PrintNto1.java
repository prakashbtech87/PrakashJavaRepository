package com.prakash.a2zdsa.recursion;

/**
 * @author prakashkaruppusamy
 */
public class PrintNto1 {

    public static void print1toN( int n){

        if( n<=0){
            return;
        }

        System.out.print(n+" ");
        print1toN(n-1);


    }


    public static void main(String[] args) {
        print1toN(10);
    }
}
