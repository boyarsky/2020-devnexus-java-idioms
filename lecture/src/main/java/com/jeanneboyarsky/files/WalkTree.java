package com.jeanneboyarsky.files;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collectors;

public class WalkTree {


    public Collection<String> getAll(Path path) throws IOException {

        System.out.println(path.toAbsolutePath());

        return Files.walk(path)
                .map(Path::toString)
                .collect(Collectors.toList());
    }

    public Collection<String> readAll(Path path)
            throws IOException {

        return Files.walk(path)
                .map(this::readFile)
                .collect(Collectors.toList());
    }

    private String readFile(Path path) {
        try {
            return Files.readString(path);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
