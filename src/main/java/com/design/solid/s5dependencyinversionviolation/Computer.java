package com.design.solid.s5dependencyinversionviolation;

/**
 * @author prakashkaruppusamy
 */
public class Computer {
    private WiredKeyBoard keyBoard = new WiredKeyBoard();

    public void start() {
        keyBoard.connect();
    }
}
