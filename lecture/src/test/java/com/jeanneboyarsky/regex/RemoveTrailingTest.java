package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveTrailingTest {

    @Test
    void remove() {
        assertEquals("123 abc", RemoveTrailing.removeTrailingPeriod("123 abc."));
        assertEquals("x abc", RemoveTrailing.removeTrailingPeriod("x abc"));
    }

}