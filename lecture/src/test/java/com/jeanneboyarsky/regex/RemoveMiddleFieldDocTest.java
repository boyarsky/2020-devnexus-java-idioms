package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveMiddleFieldDocTest {

    @Test
    void removeMiddle() {
        String csv = "first,middle,last";
        String actual = RemoveMiddleFieldDoc.removeMiddle(csv);

        assertEquals("first,last", actual);
    }

}