package com.design.solid.s3liskovviolation;

/**
 * @author prakashkaruppusamy
 */
public class LSPViolation {
    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sprarrow = new Sparrow();
        sprarrow.fly();
        penguin.fly();
    }
}
