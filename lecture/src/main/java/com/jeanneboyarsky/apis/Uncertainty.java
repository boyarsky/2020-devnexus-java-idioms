package com.jeanneboyarsky.apis;

import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

public class Uncertainty {

    // 0 <= x < 1
    public double randomMath() {
        return Math.random();
    }

    // 0 <= x < 1
    public double random() {
        Random random = new Random();
        return random.nextDouble();
    }

    // 0 <= x < max
    public int randomIntUnderMax(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    // 1 <= x <= max
    public int randomIntOneToMax(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }

    public IntStream infiniteIntStream() {
        Random random = new Random();
        return random.ints();
    }

    public IntStream finiteIntStream() {
        Random random = new Random();
        return random.ints(5);
    }

    // example: fe3957e5-d91a-48db-9631-260fedb0e341
    public UUID uuid() {
        return UUID.randomUUID();
    }
}
