package com.jeanneboyarsky.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    private Sorting target;

    @BeforeEach
    void setUp() {
        target = new Sorting();
    }

    @Test
    void sortAlphabetically() {
        List<String> expected = List.of("d", "e", "z");
        List<String> list = Arrays.asList("z", "e", "d");
        target.sortAlphabetically(list);
        assertEquals(expected, list);
    }

    @Test
    void sortBackwards() {
        List<String> expected = List.of("z", "e", "d");
        List<String> list = Arrays.asList("z", "e", "d");
        target.sortBackwards(list);
        assertEquals(expected, list);
    }

    @Test
    void sortByLength() {
        List<String> expected = List.of("e", "dd", "zzz");
        List<String> list = Arrays.asList("zzz", "e", "dd");
        target.sortByLength(list);
        assertEquals(expected, list);
    }

    @Test
    void sortByLengthReversed() {
        List<String> expected = List.of("zzz", "dd", "e");
        List<String> list = Arrays.asList("zzz", "e", "dd");
        target.sortByLengthReversed(list);
        assertEquals(expected, list);
    }
}