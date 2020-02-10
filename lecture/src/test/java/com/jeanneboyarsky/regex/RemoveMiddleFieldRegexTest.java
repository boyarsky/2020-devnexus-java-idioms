package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveMiddleFieldRegexTest {

    @Test
    void removeMiddle() {
        String csv = "first,middle,last";
        String actual = RemoveMiddleFieldRegex.removeMiddle(csv);

        assertEquals("first,last", actual);
    }

}