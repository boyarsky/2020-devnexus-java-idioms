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

class AppendFileTest {

    private static Path outputPath;

    private AppendToFile target;

    @BeforeEach
    void setUp() {
        Random random = new Random();
        outputPath = Paths.get("lecture/src/test/resources/junit-" + random.nextInt());
        target = new AppendToFile();
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.delete(outputPath);
    }

    @Test
    void append() throws IOException {
        String text = "The";
        String moreText = " Zoo";
        Files.writeString(outputPath, text);
        target.append(outputPath, List.of(moreText));

        String actual = Files.readString(outputPath);
        assertEquals("The Zoo", actual.strip());
    }


}