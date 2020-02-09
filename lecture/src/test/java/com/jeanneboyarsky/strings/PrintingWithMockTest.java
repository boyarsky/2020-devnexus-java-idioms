package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintingWithMockTest {

    private PrintingWithMock target;
    private ByteArrayOutputStream mock;

    @BeforeEach
    void setUp() {
        mock = new ByteArrayOutputStream();
        target = new PrintingWithMock(new PrintStream((mock)));
    }

    @Test
    void print() {
        target.helloAtlanta();
        String actual = mock.toString();
        assertEquals("Hello Atlanta", actual);
    }

}