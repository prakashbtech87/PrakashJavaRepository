package com.prakash.version.java17.random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * @author prakashkaruppusamy
 */
public class RandomGeneratorUsingAlgorithm {

    public static void main(String[] args) {

        // Use a specific PRNG algorithm (Xoroshiro128PlusPlus)
        RandomGenerator xoroshiro = RandomGeneratorFactory.of("Xoroshiro128PlusPlus").create();

        // Generate a random int
        int randomInt = xoroshiro.nextInt();
        System.out.println("Random Integer (Xoroshiro128PlusPlus): " + randomInt);

        // Generate a random double
        double randomDouble = xoroshiro.nextDouble();
        System.out.println("Random Double (Xoroshiro128PlusPlus): " + randomDouble);

    }

}
