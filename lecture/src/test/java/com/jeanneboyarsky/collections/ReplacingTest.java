package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReplacingTest {

    private Replacing target;

    @BeforeEach
    void setUp() {
        target = new Replacing();
    }

    @Test
    void doubleString() {
        List<String> list = new ArrayList<>(List.of("x"));
        target.doubleString(list);
        assertEquals(1, list.size());
        assertEquals("xx", list.get(0));
    }

}