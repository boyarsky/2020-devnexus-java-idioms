package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlyWhitespaceTest {

    private OnlyWhitespace target;

    @BeforeEach
    void setUp() {
        target = new OnlyWhitespace();
    }


    @Test
    void validateOnlyWhitespaceBad() {
        target.validateOnlyWhitespaceBad("text");
        assertThrows(IllegalArgumentException.class, () -> target.validateOnlyWhitespaceBad(" "));
    }

    @Test
    void validateOnlyWhitespaceBetter() {
        target.validateOnlyWhitespaceBetter("text");
        assertThrows(IllegalArgumentException.class, () -> target.validateOnlyWhitespaceBetter(" "));
    }

    @Test
    void validateOnlyWhitespaceBitBetter() {
        target.validateOnlyWhitespaceBitBetter("text");
        assertThrows(IllegalArgumentException.class, () -> target.validateOnlyWhitespaceBitBetter(" "));
    }

    @Test
    void validateOnlyWhitespaceBest() {
        target.validateOnlyWhitespaceBest("text");
        assertThrows(IllegalArgumentException.class, () -> target.validateOnlyWhitespaceBest(" "));
    }
}