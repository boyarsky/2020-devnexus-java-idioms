package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceAllCaseInsensitiveTest {

    @Test
    void replaceShort() {
        assertEquals("123", ReplaceAllCaseInsensitive.replaceShort("123xXx"));
        assertEquals("", ReplaceAllCaseInsensitive.replaceShort("XXX"));
        assertEquals("x", ReplaceAllCaseInsensitive.replaceShort("x"));
    }

    @Test
    void replaceLong() {
        assertEquals("http://", ReplaceAllCaseInsensitive.replaceLong("http://www.google.com"));
        assertEquals("", ReplaceAllCaseInsensitive.replaceLong("www.google.COM"));
        assertEquals("x", ReplaceAllCaseInsensitive.replaceLong("x"));
    }

}