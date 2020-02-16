package com.jeanneboyarsky.advancedstreams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlatMapTest {

    private FlatMap target;

    @BeforeEach
    void setUp() {
        target = new FlatMap();
    }

    @Test
    void method() {
        List<String> expected = List.of("a", "b");
        List<String> actual = target.method();
        assertEquals(expected, actual);
    }

}