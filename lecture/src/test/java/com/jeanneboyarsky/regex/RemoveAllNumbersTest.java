package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveAllNumbersTest {

    @Test
    void remove() {
        assertEquals(" abc ", RemoveAllNumbers.removeAll("123 abc 456"));
        assertEquals("abc", RemoveAllNumbers.removeAll("abc"));
    }

}