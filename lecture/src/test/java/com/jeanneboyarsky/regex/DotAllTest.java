package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DotAllTest {

    @Test
    void remove() {
        String expected = "<form></form>";
        String text = "<form>\n<p>\nabc\n</p>\n</form>";
        assertEquals(expected, DotAll.remove(text));
    }
}