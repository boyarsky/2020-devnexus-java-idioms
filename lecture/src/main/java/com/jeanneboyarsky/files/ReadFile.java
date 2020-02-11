package com.jeanneboyarsky.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ReadFile {


    public String readIntoString(Path path) throws IOException {
        return new String(Files.readAllBytes(path));
    }

    public List<String> readIntoList(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public long numEmptyLines(Path path) throws IOException {
        try (Stream<String>lines = Files.lines(path)) {
            return lines.map(String::trim)
                    .filter(String::isEmpty)
                    .count();
        }
    }
}
