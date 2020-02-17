package com.jeanneboyarsky.files;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class SeparatorsTest {

    private  Separators target;

    @BeforeEach
    void setUp() {
        target = new  Separators();
    }

    @Test
    void smokeTest() throws IOException {
        target.print();
    }
}