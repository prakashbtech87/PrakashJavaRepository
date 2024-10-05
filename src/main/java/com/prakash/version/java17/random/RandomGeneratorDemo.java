package com.prakash.version.java17.random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * @author prakashkaruppusamy
 */
public class RandomGeneratorDemo {

    public static void main(String[] args) {

        // Get the default random generator (likely an instance of SplittableRandom)
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("Random").create();

        // Generate a random int
        int randomInt = randomGenerator.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate a random double
        double randomDouble = randomGenerator.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generate a random long
        long randomLong = randomGenerator.nextLong();
        System.out.println("Random Long: " + randomLong);
    }

}
