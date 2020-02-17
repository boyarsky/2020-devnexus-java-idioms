package com.jeanneboyarsky.files;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WriteFileJava11Test {

    private static Path outputPath;

    private WriteFileJava11 target;

    @BeforeEach
    void setUp() {
        Random random = new Random();
        outputPath = Paths.get("lecture/src/test/resources/junit-" + random.nextInt());
        target = new WriteFileJava11();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(outputPath);
    }

    @Test
    void writeFromString() throws IOException {
        String text = "Zoo";
        target.writeFromString(outputPath, text);

        String actual = Files.readString(outputPath);
        assertEquals(text, actual);
    }

}