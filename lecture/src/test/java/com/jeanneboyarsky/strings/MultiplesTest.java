package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplesTest {

    private Multiples target;

    @BeforeEach
    void setUp() {
        target = new Multiples();
    }


    @Test
    void tenStarsBad() {
        String expected = "**********";
        String actual = target.tenStarsBad();
        assertEquals(expected, actual);
    }

    @Test
    void tenStars() {
        String expected = "**********";
        String actual = target.tenStars();
        assertEquals(expected, actual);
    }

}