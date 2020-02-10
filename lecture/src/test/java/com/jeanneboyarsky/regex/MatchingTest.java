package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MatchingTest {

    @Test
    void isOnlyDigits() {
        assertTrue(Matching.isOnlyDigits("123456"));
        assertFalse(Matching.isOnlyDigits("123 456"));
        assertFalse(Matching.isOnlyDigits("x"));
    }

    @Test
    void atLeastOneDigit() {
        assertTrue(Matching.atLeastOneDigit("123456"));
        assertTrue(Matching.atLeastOneDigit("123 456"));
        assertFalse(Matching.atLeastOneDigit("x"));
    }

}