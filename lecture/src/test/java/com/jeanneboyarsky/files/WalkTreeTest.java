package com.jeanneboyarsky.files;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WalkTreeTest {

    private WalkTree target;

    @BeforeEach
    void setUp() {
        target = new WalkTree();
    }

    @Test
    void getAll() throws IOException {
        Path path = Paths.get("lecture/src");
        Collection<String> actual = target.getAll(path);
        assertTrue(actual.contains("lecture/src/main/java/com/jeanneboyarsky/files/WalkTree.java"));
    }

}