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

class WriteFileTest {

    private static Path outputPath;

    private WriteFile target;

    @BeforeEach
    void setUp() {
        Random random = new Random();
        outputPath = Paths.get("lecture/src/test/resources/junit-" + random.nextInt());
        target = new WriteFile();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.delete(outputPath);
    }

    @Test
    void writeFile() throws IOException {
        String text = "Zoo";
        target.writeFile(outputPath, text);

        String actual = Files.readString(outputPath);
        assertEquals(text, actual);
    }

    @Test
    void writeFileLines() throws IOException {
        String text = "Zoo";
        target.writeFile(outputPath, List.of(text));

        String actual = Files.readString(outputPath);
        assertEquals(text + "\n", actual);
    }


}