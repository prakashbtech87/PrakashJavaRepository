package com.design.solid.s5dependencyinversionsafe;

/**
 * @author prakashkaruppusamy
 */
public class WiredKeyBoard implements KeyBoard{
    @Override
    public void connect() {
        System.out.println("Wired keyboard connected");
    }
}
