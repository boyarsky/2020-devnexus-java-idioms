package com.jeanneboyarsky.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class JoinTest {

    private Join target;

    @BeforeEach
    void setUp() {
        target = new Join();
    }

    @Test
    void join() {
        List<Integer> list = List.of(1, 2, 3);
        assertEquals("1 2 3", target.join(list));
    }

    @Test
    void joinStream() {
        List<Integer> list = List.of(1, 2, 3);
        assertEquals("1 2 3", target.joinStream(list));
    }


}