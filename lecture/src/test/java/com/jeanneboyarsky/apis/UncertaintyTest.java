package com.jeanneboyarsky.apis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class UncertaintyTest {

    private static final int MAX = 10;

    private Uncertainty target;

    @BeforeEach
    void setUp() {
        target = new Uncertainty();
    }

    @RepeatedTest(100)
    void randomMath() {
        double actual = target.randomMath();
        assertTrue(actual >= 0, ">= 0");
        assertTrue(actual < 1, "< 1");
    }

    @RepeatedTest(100)
    void random() {
        double actual = target.random();
        assertTrue(actual >= 0, ">= 0");
        assertTrue(actual < 1, "< 1");
    }

    @RepeatedTest(100)
    void randomIntUnderMax() {
        int actual = target.randomIntUnderMax(MAX);
        assertTrue(actual >= 0, ">= 0");
        assertTrue(actual < MAX, "< " + MAX);
    }

    @RepeatedTest(100)
    void randomIntOneToMax() {
        int actual = target.randomIntOneToMax(MAX);
        assertTrue(actual >= 1, ">= 1");
        assertTrue(actual <= MAX, "<=" + MAX);
    }

    @Test
    void infiniteIntStream() {
        IntStream actual = target.infiniteIntStream();
        assertEquals(Long.MAX_VALUE, actual.spliterator().estimateSize());
    }

    @Test
    void  finiteIntStream() {
        IntStream actual = target.finiteIntStream();
        assertEquals(5, actual.count());
    }

    @Test
    void uuid_smokeTest() {
        target.uuid();
    }
}