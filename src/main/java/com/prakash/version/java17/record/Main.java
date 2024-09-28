package com.prakash.version.java17.record;

/**
 * @author prakashkaruppusamy
 */
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion", "Mammal", 50);

        // Accessing data
        System.out.println("Animal Name: " + lion.name());
        System.out.println("Animal Type: " + lion.animalType());
        System.out.println("Running Speed: " + lion.runningSpeed());

        // Using toString() automatically
        System.out.println(lion); // Output: Animal[name=Lion, animalType=Mammal, runningSpeed=50]
    }
}
