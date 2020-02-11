package com.jeanneboyarsky.files;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    private static final String LECTURE_SRC_TEST_RESOURCES_TOURIST_TXT = "lecture/src/test/resources/tourist.txt";

    private ReadFile target;

    @BeforeEach
    void setUp() {
        target = new ReadFile();
    }

    @Test
    void readIntoString() throws IOException  {
        String expected = "Zoo\n" +
                "Aquarium\n" +
                "Coca-Cola Museum";
        Path path = Paths.get(LECTURE_SRC_TEST_RESOURCES_TOURIST_TXT);
        String actual = target.readIntoString(path);
        assertEquals(expected, actual);
    }

    @Test
    void readIntoList() throws IOException {
        List<String> expected = List.of("Zoo", "Aquarium", "Coca-Cola Museum");
        Path path = Paths.get(LECTURE_SRC_TEST_RESOURCES_TOURIST_TXT);
        List<String> actual = target.readIntoList(path);
        assertEquals(expected, actual);
    }

    @Test
    void numEmptyLines() throws IOException {
        Path path = Paths.get(LECTURE_SRC_TEST_RESOURCES_TOURIST_TXT);
        long actual = target.numEmptyLines(path);
        assertEquals(0, actual);
    }
}