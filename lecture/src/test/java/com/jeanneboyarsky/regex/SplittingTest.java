package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SplittingTest {

    @Test
    void nameParts() {
        String[] actual = Splitting.nameParts("Boyarsky, Jeanne");
        assertEquals(2, actual.length);
        assertEquals("Boyarsky", actual[0]);
        assertEquals("Jeanne", actual[1]);
    }

}