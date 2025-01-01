package com.prakash.a2zdsa.recursion;

/**
 * @author prakashkaruppusamy
 */
public class Print1toN {

    public static void print1toN( int n){

        if( n<=0){
            return;
        }
        print1toN(n-1);
        System.out.print(n+" ");


    }


    public static void main(String[] args) {
        print1toN(10);
    }
}
