package com.design.solid.s5dependencyinversionviolation;

/**
 * @author prakashkaruppusamy
 */
public class DIPViolation {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.start();
    }
}
