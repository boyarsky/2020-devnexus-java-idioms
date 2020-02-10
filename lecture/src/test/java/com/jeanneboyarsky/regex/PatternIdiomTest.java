package com.jeanneboyarsky.regex;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatternIdiomTest {

    @Test
    void tags() {
        String html = "<html><head><title>hi></title></head><body></body></html>";
        Set expected = Set.of("html", "head", "title", "body");
        Set<String> actual = PatternIdiom.getTags(html);
        assertEquals(expected, actual);
    }

    @Test
    void sanitize() {
        String text = "The 123.123.123.123 is";
        String expected = "The xxx is";
        String actual = PatternIdiom.sanitize(text);
        assertEquals(expected, actual);
    }
}