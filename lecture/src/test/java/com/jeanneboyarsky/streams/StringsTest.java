package com.jeanneboyarsky.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringsTest {

    private Strings target;

    @BeforeEach
    void setUp() {
        target = new Strings();
    }

    @Test
    void countLinesWithQuestion() {
        String text = "Ok? \nMaybe. \nNot?";
        assertEquals(2, target.countLinesWithQuestion(text));
    }

    @Test
    void countQuestionMarks() {
        String text = "Ok? ???. \nNot?";
        assertEquals(5, target.countQuestionMarks(text));
    }
}