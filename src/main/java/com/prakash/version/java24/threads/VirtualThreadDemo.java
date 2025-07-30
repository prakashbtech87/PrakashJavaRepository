package com.prakash.version.java24.threads;

import java.util.concurrent.TimeUnit;

/**
 * Demonstrates true virtual threads (JDK 25) using {@code Thread.startVirtualThread()}.
 * Creates 10,000 virtual-thread tasks, each printing a message.
 */
public class VirtualThreadDemo {
    
    private static final int THREAD_COUNT = 10_000;
    
    public void runDemo() {
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= THREAD_COUNT; i++) {
            int threadNum = i;
            Thread.startVirtualThread(() ->
                    System.out.println("Virtual Thread " + threadNum + ": Hello from " + Thread.currentThread())
            );//
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nVirtual Threads demo completed in " + (endTime - startTime) + " ms");
    }
}
