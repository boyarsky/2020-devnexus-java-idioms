package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.jeanneboyarsky.collections.ListContains.Name;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListContainsTest {

    private ListContains target;

    @BeforeEach
    void setUp() {
        target = new ListContains();
    }

    @Test
    void findMatch() {
        List<String> list = List.of("x", "y", "z");
        assertTrue(target.findMatch(list, "y"));
        assertFalse(target.findMatch(list,"a"));
    }

    @Test
    void findMatchWithoutEquals() {
        List<Name> list = List.of(new Name("Jeanne"));
        assertTrue(target.findMatchWithoutEquals(list, "Jeanne"));
        assertFalse(target.findMatchWithoutEquals(list,"No Match"));
    }
}