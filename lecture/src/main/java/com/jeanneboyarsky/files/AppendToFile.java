package com.jeanneboyarsky.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class AppendToFile {

    public void append(Path path, List<String> list)
            throws IOException {
        Files.write(path, list, StandardOpenOption.APPEND);
    }
}
