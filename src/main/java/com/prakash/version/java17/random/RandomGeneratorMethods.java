package com.prakash.version.java17.random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * @author prakashkaruppusamy
 */
public class RandomGeneratorMethods {

    public static void main(String[] args) {

        // Get the default random generator (likely an instance of SplittableRandom)
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("Random").create();
        RandomGeneratorFactory.all().map(factory -> factory.group() + ":" + factory.name())
                .sorted()
                .forEach(System.out::println);

    }

}
