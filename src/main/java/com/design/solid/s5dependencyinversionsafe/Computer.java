package com.design.solid.s5dependencyinversionsafe;

/**
 * @author prakashkaruppusamy
 */
public class Computer {
    private KeyBoard keyBoard;

    public Computer(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void start(){
        keyBoard.connect();
    }
}
