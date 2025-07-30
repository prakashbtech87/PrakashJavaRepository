package com.prakash.version.java24.threads;

/**
 * Compares performance between platform threads and virtual threads
 */
public class ThreadComparisonDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Starting Thread Performance Comparison ===\n");
        
        try {
            // Run Platform Thread Demo
            System.out.println("🚀 Starting Platform Threads Demo...");
            PlatformThreadDemo platformDemo = new PlatformThreadDemo();
            long platformStart = System.currentTimeMillis();
            platformDemo.runDemo();
            long platformEnd = System.currentTimeMillis();
            long platformDuration = platformEnd - platformStart;
            
            // Add a small delay between demos
            Thread.sleep(2000);
            
            // Run Virtual Thread Demo
            System.out.println("\n🚀 Starting Virtual Threads Demo...");
            VirtualThreadDemo virtualDemo = new VirtualThreadDemo();
            long virtualStart = System.currentTimeMillis();
            virtualDemo.runDemo();
            long virtualEnd = System.currentTimeMillis();
            long virtualDuration = virtualEnd - virtualStart;
            
            // Print comparison results
            System.out.println("\n=== Performance Comparison Results ===");
            System.out.printf("Platform Threads: %d ms%n", platformDuration);
            System.out.printf("Virtual Threads:  %d ms%n", virtualDuration);
            if (virtualDuration > 0) {
                System.out.printf("Improvement:      %.2fx faster%n", 
                               (double)platformDuration / virtualDuration);
            } else {
                System.out.println("Virtual threads completed too quickly to measure improvement");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread comparison was interrupted");
        } catch (Exception e) {
            System.err.println("An error occurred during thread comparison: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
