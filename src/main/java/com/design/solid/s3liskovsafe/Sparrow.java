package com.design.solid.s3liskovsafe;

/**
 * @author prakashkaruppusamy
 */
public class Sparrow extends Bird implements FlyingBird {
    @Override
    void makesound() {
        System.out.println("Chirp Chirp");
    }

    @Override
    public void fly() {
        System.out.println("Am flying...");
    }
}
