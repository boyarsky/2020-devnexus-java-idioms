package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.jeanneboyarsky.collections.Removing.Name;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemovingTest {

    private Removing target;

    @BeforeEach
    void setUp() {
        target = new Removing();
    }

    @Test
    void remove() {
        List<String> list = new ArrayList<>(List.of("x", "y", "z"));
        target.remove(list,"x");
        assertEquals(2, list.size());
        assertEquals("y", list.get(0));
        assertEquals("z", list.get(1));
    }

    @Test
    void removeEquals() {
        List<Name> list = List.of(new Name("Jeanne"), new Name("Scott"));
        target.removeWithoutEquals(list, "Jeanne");
        assertEquals(1, list.size());
        assertEquals("Scott", list.get(0).getFirstName());
    }
}