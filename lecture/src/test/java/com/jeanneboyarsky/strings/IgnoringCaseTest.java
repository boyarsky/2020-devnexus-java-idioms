package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IgnoringCaseTest {

    private IgnoringCase target;

    @BeforeEach
    void setUp() {
        target = new IgnoringCase();
    }


    @Test
    void bad() {
        assertTrue(target.equalsBad("abc", "ABC"));
        assertFalse(target.equalsBad("abc", "123"));
        assertEquals(0, target.compareBad("abc", "ABC"));
        assertNotEquals(0, target.compareBad("abc", "123"));
    }

    @Test
    void better() {
        assertTrue(target.equalsBetter("abc", "ABC"));
        assertFalse(target.equalsBetter("abc", "123"));
        assertEquals(0, target.compareBetter("abc", "ABC"));
        assertNotEquals(0, target.compareBetter("abc", "123"));
    }
}