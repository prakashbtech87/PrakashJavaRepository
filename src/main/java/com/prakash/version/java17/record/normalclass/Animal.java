package com.prakash.version.java17.record.normalclass;

import java.util.Objects;

/**
 * @author prakashkaruppusamy
 */
class Animal {
    String name;
    String animalType;
    long runningSpeed;

    // Constructor
    public Animal(String name, String animalType, long runningSpeed) {
        this.name = name;
        this.animalType = animalType;
        this.runningSpeed = runningSpeed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public long getRunningSpeed() {
        return runningSpeed;
    }

    // toString() method
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalType='" + animalType + '\'' +
                ", runningSpeed=" + runningSpeed +
                '}';
    }

    // hashCode and equals methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return runningSpeed == animal.runningSpeed &&
                name.equals(animal.name) &&
                animalType.equals(animal.animalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, animalType, runningSpeed);
    }
}