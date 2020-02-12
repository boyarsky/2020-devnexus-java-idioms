package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AllMethodsTest {

    private AllMethods target;

    @BeforeEach
    void setUp() {
        target = new AllMethods();
    }

    @Test
    void union() {
        Set<Integer> set = Set.of(1,2,3);
        Set<Integer> actual = target.union(set, List.of(3,4,5));
        Set<Integer> expected = Set.of(1,2,3,4,5);
        assertEquals(expected, actual);
    }

    @Test
    void intersection() {
        Set<Integer> set = Set.of(1,2,3);
        Set<Integer> actual = target.intersection(set, List.of(3,4,5));
        Set<Integer> expected = Set.of(3);
        assertEquals(expected, actual);
    }

    @Test
    void distinct() {
        Set<Integer> set = Set.of(1,2,3);
        Set<Integer> actual = target.distinct(set, List.of(3,4,5));
        Set<Integer> expected = Set.of(1,2);
        assertEquals(expected, actual);
    }
}