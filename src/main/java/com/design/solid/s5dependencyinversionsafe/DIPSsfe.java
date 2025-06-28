package com.design.solid.s5dependencyinversionsafe;

/**
 * @author prakashkaruppusamy
 */
public class DIPSsfe {
    public static void main(String[] args) {
        KeyBoard wired = new WiredKeyBoard();
        Computer pc1 = new Computer(wired);
        pc1.start();

        KeyBoard wireless = new WirelessKeyBoard();
        Computer pc2 = new Computer(wireless);
        pc2.start();
    }
}
