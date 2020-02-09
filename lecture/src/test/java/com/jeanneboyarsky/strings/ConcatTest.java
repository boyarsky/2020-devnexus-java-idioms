package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConcatTest {

    private Concat target;

    @BeforeEach
    void setUp() {
        target = new Concat();
    }


    @Test
    void builder() {
        String expected = "0 1 2 3 4 5 6 7 8 9 ";
        String actual = target.builder();
        assertEquals(expected, actual);
    }

    @Test
    void concat() {
        String expected = "0 1 2 3 4 5 6 7 8 9 ";
        String actual = target.concat();
        assertEquals(expected, actual);
    }

}