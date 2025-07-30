package com.prakash.version.java24.threads;

/**
 * Demonstrates traditional platform threads (pre-Java 24)
 * Creates 10,000 platform threads, each printing a message
 */
public class PlatformThreadDemo {
    
    private static final int THREAD_COUNT = 10_000;
    
    public void runDemo() {
        long startTime = System.currentTimeMillis();
        
        for (int i = 1; i <= THREAD_COUNT; i++) {
            final int threadNum = i;
            Thread thread = new Thread(() -> {
                System.out.println("Platform Thread " + threadNum + ": Hello from " + Thread.currentThread());
            });
            thread.start();
            
            // Add a small delay to prevent overwhelming the system
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("\nPlatform Threads Demo completed in " + (endTime - startTime) + " ms");
    }
}
