package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ComparingToStringBuilderTest {

    private static final String TEXT = "text";

    private ComparingToStringBuilder target;
    private StringBuilder builder;

    @BeforeEach
    void setUp() {
        target = new ComparingToStringBuilder();
        builder = new StringBuilder(TEXT);
    }


    @Test
    void usingEquals() {
        assertTrue(target.usingEquals(TEXT, builder));
        assertFalse(target.usingEquals("other", builder));
    }

    @Test
    void usingContentEquals() {
        assertTrue(target.better(TEXT, builder));
        assertFalse(target.better("other", builder));
    }

}