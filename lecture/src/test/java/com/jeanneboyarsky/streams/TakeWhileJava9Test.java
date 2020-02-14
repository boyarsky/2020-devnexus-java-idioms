package com.jeanneboyarsky.streams;

import static com.jeanneboyarsky.streams.TakeWhileJava9.Build;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TakeWhileJava9Test {

    private TakeWhileJava9 target;

    @BeforeEach
    void setUp() {
        target = new TakeWhileJava9();
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