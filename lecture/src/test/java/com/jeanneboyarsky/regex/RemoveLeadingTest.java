package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveLeadingTest {

    @Test
    void remove() {
        assertEquals(" abc", RemoveLeading.removeLeadingNumbers("123 abc"));
        assertEquals("x abc", RemoveLeading.removeLeadingNumbers("x abc"));
    }

}