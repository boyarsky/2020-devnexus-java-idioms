package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveMiddleFieldBadTest {

    @Test
    void removeMiddle() {
        String csv = "first,middle,last";
        String actual = RemoveMiddleFieldBad.removeMiddle(csv);

        assertEquals("first,last", actual);
    }

}