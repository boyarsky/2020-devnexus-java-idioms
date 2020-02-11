package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapsTest {

    private Maps target;

    @BeforeEach
    void setUp() {
        target = new Maps();
    }

    @Test
    void addIfMissing() {
        Map<Integer, String> map = new HashMap<>();
        target.addIfMissing(map,  1, "a");
        target.addIfMissing(map,  1, "b");
        assertEquals(1, map.size());
        assertEquals("a", map.get(1));
    }
}