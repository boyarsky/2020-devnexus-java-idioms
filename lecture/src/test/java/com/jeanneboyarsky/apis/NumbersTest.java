package com.jeanneboyarsky.apis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersTest {

    private Numbers target;

    @BeforeEach
    void setUp() {
        target = new Numbers();
    }

    @Test
    void absoluteValue() {
        assertEquals(1, target.absoluteValue(1));
        assertEquals(2, target.absoluteValue(-2));
    }

    @Test
    void biggest() {
        assertEquals(3, target.biggest(1, 3));
        assertEquals(5, target.biggest(5, 3));
    }

    @Test
    void smallest() {
        assertEquals(1, target.smallest(1, 3));
        assertEquals(3, target.smallest(5, 3));
    }

    @Test
    void power() {
        assertEquals(25, target.power(5, 2));
        assertEquals(8, target.power(2, 3));
    }
}