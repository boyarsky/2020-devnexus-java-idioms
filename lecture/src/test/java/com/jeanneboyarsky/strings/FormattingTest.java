package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormattingTest {

    private Formatting target;
    private ByteArrayOutputStream mock;
    private PrintStream originalSystemOut;

    @BeforeEach
    void setUp() {
        mock = new ByteArrayOutputStream();
        target = new Formatting();
        originalSystemOut = System.out;
        System.setOut(new PrintStream(mock));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalSystemOut);
    }

    @Test
    void format() {
        target.printPi();
        String expected = "Pi is 3.14 to the nearest 2 digits";
        String actual = mock.toString();
        assertEquals(expected, actual);
    }
}