package com.jeanneboyarsky.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {

    private Basic target;

    @BeforeEach
    void setUp() {
        target = new Basic();
    }

    @Test
    void method() {
        List<String> list = List.of(" a b ", "", "  ", "x");
        List<Integer> expected = List.of(3, 1);
        List<Integer> actual = target.method(list);
        assertEquals(expected, actual);
    }

}