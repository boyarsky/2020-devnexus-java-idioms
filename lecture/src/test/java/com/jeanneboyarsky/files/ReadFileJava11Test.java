package com.jeanneboyarsky.files;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReadFileJava11Test {

    private static final String LECTURE_SRC_TEST_RESOURCES_TOURIST_TXT = "lecture/src/test/resources/tourist.txt";

    private ReadFileJava11 target;

    @BeforeEach
    void setUp() {
        target = new ReadFileJava11();
    }

    @Test
    void readIntoString() throws IOException  {
        String expected = "Zoo\n" +
                "Aquarium\n" +
                "Coca-Cola Museum";
        Path path = Paths.get(LECTURE_SRC_TEST_RESOURCES_TOURIST_TXT);
        System.out.println(path.toAbsolutePath().toString());
        String actual = target.readIntoString(path);
        assertEquals(expected, actual);
    }

}