package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GetOrDefaultTest {

    private GetOrDefault target;

    @BeforeEach
    void setUp() {
        target = new GetOrDefault();
    }

    @Test
    void total() {
        Map<String, Integer> map = Map.ofEntries(Map.entry("a", 1));
        int actual = target.total(map, "a", "b");
        assertEquals(1, actual);
    }

}