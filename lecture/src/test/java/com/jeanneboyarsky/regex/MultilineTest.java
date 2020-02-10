package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultilineTest {

    @Test
    void remove() {
        String expected = "x\ny\nz\n";
        String text = "x\n y\n z\n";
        assertEquals(expected, Multiline.remove(text));
    }
}