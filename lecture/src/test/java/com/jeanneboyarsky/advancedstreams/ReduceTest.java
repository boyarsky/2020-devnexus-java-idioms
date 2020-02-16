package com.jeanneboyarsky.advancedstreams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ReduceTest {

    private Reduce target;

    @BeforeEach
    void setUp() {
        target = new Reduce();
    }

    @Test
    void sum() {
        assertEquals(3, target.sum(List.of(1,2)));
        assertEquals(0, target.sum(List.of()));
    }

    @Test
    void min() {
        assertEquals(1, target.min(List.of(1,2)).get());
        assertFalse(target.min(List.of()).isPresent());
    }
}