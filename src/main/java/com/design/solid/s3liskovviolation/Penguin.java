package com.design.solid.s3liskovviolation;

/**
 * @author prakashkaruppusamy
 */
public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cant fly");
    }
}
