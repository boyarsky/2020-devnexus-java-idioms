package com.jeanneboyarsky.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static com.jeanneboyarsky.streams.DropWhileJava9.Build;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DropWhileJava9Test {

    private DropWhileJava9 target;

    @BeforeEach
    void setUp() {
        target = new DropWhileJava9();
    }

    @Test
    void getMostRecentSuccess() {
        List<Build> list = List.of(new Build(false,5),
                new Build(false, 4),
                new Build(true, 3),
                new Build(true, 2),
                new Build(false, 1));
        List<Integer> expected = List.of(5, 4);
        Optional<Integer> actual = target.getMostRecentSuccess(list);
        assertEquals(3, actual.get());
    }




}