package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoorCsvTest {

    private PoorCsv target;

    @BeforeEach
    void setUp() {
        target = new PoorCsv();
    }


    @Test
    void commaSeparatedBad() {
        List<String> fields = List.of("first", "last");
        String expected = "first,last";
        String actual = target.commaSeparatedBad(fields);
        assertEquals(expected, actual);
    }

    @Test
    void commaSeparated() {
        List<String> fields = List.of("first", "last");
        String expected = "first,last";
        String actual = target.commaSeparated(fields);
        assertEquals(expected, actual);
    }

}