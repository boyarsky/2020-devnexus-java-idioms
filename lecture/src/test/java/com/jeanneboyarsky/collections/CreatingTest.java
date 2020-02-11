package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CreatingTest {

    private Creating target;

    @BeforeEach
    void setUp() {
        target = new Creating();
    }

    @Test
    void createList() {
        List<Integer> actual = target.createList();
        assertEquals(3, actual.size());
        assertEquals(1, actual.get(0));
        assertEquals(2, actual.get(1));
        assertEquals(3, actual.get(2));
    }

    @Test
    void createMutableList() {
        List<Integer> actual = target.createMutableList();
        actual.remove(2);
        assertEquals(2, actual.size());
        assertEquals(1, actual.get(0));
        assertEquals(2, actual.get(1));
    }

    @Test
    void createSet() {
        Set<Integer> actual = target.createSet();
        assertEquals(3, actual.size());
        assertTrue(actual.contains(1));
        assertTrue(actual.contains(2));
        assertTrue(actual.contains(3));
    }

    @Test
    void createMap() {
        Map<String, Integer> actual = target.createMap();
        assertEquals(2, actual.size());
        assertEquals(1, actual.get("a"));
        assertEquals(2, actual.get("b"));
    }
}