package com.design.solid.s3liskovviolation;

/**
 * @author prakashkaruppusamy
 */
public class Sparrow extends Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}
