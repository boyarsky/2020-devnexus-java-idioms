package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintingTest {

    private Printing target;
    private ByteArrayOutputStream mock;
    private PrintStream originalSystemOut;

    @BeforeEach
    void setUp() {
        mock = new ByteArrayOutputStream();
        target = new Printing();
        originalSystemOut = System.out;
        System.setOut(new PrintStream(mock));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalSystemOut);
    }

    @Test
    void print() {
        target.helloAtlanta();
        String actual = mock.toString();
        assertEquals("Hello Atlanta", actual);
    }
}