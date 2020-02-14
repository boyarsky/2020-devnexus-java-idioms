package com.jeanneboyarsky.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class MaxTest {

    private Max target;

    @BeforeEach
    void setUp() {
        target = new Max();
    }

    @Test
    void max() {
        List<Integer> list = new ArrayList<>(List.of(3,5,2));
        assertEquals(5, target.max(list).getAsInt());
        assertFalse(target.max(List.of()).isPresent());
    }

    @Test
    void maxStream() {
        List<Integer> list = new ArrayList<>(List.of(3,5,2));
        assertEquals(5, target.maxStream(list).getAsInt());
        assertFalse(target.maxStream(List.of()).isPresent());
    }


}