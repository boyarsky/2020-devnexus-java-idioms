package com.jeanneboyarsky.advancedstreams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateTest {

    private Generate target;

    @BeforeEach
    void setUp() {
        target = new Generate();
    }

    @Test
    void tenStars() {
        String actual = target.tenStars();
        assertEquals("**********", actual);
    }

    @Test
    void counting() {
        String actual = target.counting();
        assertEquals("1 2 3 4 5 6 7 8 9 10", actual);
    }

    @Test
    void countingWithLimit() {
        String actual = target.countingWithLimit();
        assertEquals("1 2 3 4 5 6 7 8 9 10", actual);
    }
}