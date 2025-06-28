package com.design.solid.s3liskovsafe;

/**
 * @author prakashkaruppusamy
 */
public class LSPSafe {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.makesound();
        penguin.makesound();

        FlyingBird flyingBird = new Sparrow();
        flyingBird.fly();

    }
}
