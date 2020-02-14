package com.jeanneboyarsky.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.jeanneboyarsky.streams.TakeWhile.Build;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TakeWhileTest {

    private TakeWhile target;

    @BeforeEach
    void setUp() {
        target = new TakeWhile();
    }

    @Test
    void getAllFailuresBeforeSuccess() {
        List<Build> list = List.of(new Build(false,5),
                new Build(false, 4),
                new Build(true, 3),
                new Build(false, 2),
                new Build(false, 1));
        List<Integer> expected = List.of(5, 4);
        List<Integer> actual = target.getAllFailuresBeforeSuccess(list);
        assertEquals(expected, actual);
    }




}