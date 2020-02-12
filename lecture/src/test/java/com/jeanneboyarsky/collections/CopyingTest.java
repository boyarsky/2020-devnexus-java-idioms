package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CopyingTest {

    private Copying target;

    @BeforeEach
    void setUp() {
        target = new Copying();
    }

    @Test
    void constructor() {
        List<Integer> original = List.of(1,2,3);
        List<Integer> actual = target.constructor(original);
        assertEquals(original.size(), actual.size());
        assertNotSame(original, actual);
    }

    @Test
    void copyOf() {
        List<Integer> original = new ArrayList<>();
        original.add(1);
        List<Integer> actual = target.copyOf(original);
        assertEquals(original.size(), actual.size());
        assertNotSame(original, actual);
    }

    @Test
    void synchronizedList() {
        List<Integer> original = List.of(1,2,3);
        List<Integer> actual = target.synchronizedList(original);
        assertEquals(original.size(), actual.size());
        assertNotSame(original, actual);
    }

    @Test
    void unmodifiableList() {
        List<Integer> original = List.of(1,2,3);
        List<Integer> actual = target.unmodifiableList(original);
        assertEquals(original.size(), actual.size());
        assertNotSame(original, actual);
    }
}