package com.design.solid.s5dependencyinversionsafe;

/**
 * @author prakashkaruppusamy
 */
public class WirelessKeyBoard implements KeyBoard {
    @Override
    public void connect() {
        System.out.println("Wireless keyboard connected");
    }
}
