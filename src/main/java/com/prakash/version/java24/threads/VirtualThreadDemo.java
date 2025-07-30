package com.prakash.version.java24.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Demonstrates a lightweight threading approach that simulates virtual threads
 * Creates 10,000 tasks, each printing a message
 */
public class VirtualThreadDemo {
    
    private static final int THREAD_COUNT = 10_000;
    private static final int BATCH_SIZE = 1000;
    private static final int THREAD_POOL_SIZE = 100;
    
    public void runDemo() {
        long startTime = System.currentTimeMillis();
        
        // Using a fixed thread pool to simulate lightweight concurrency
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        
        try {
            for (int i = 1; i <= THREAD_COUNT; i++) {
                final int threadNum = i;
                executor.submit(() -> {
                    System.out.println("Lightweight Task " + threadNum + ": Hello from " + Thread.currentThread());
                });
                
                // Add a small delay between batches to prevent overwhelming the system
                if (threadNum % BATCH_SIZE == 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        } finally {
            // Shutdown the executor and wait for all tasks to complete
            executor.shutdown();
            try {
                if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                    System.err.println("Some tasks did not complete within the timeout");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread pool shutdown was interrupted");
            }
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("\nLightweight Tasks Demo completed in " + (endTime - startTime) + " ms");
    }
}
