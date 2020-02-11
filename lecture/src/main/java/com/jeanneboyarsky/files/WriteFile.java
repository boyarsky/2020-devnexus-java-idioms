package com.jeanneboyarsky.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteFile {

    public void writeFile(Path path, String text) throws IOException {
        Files.write(path, text.getBytes());
    }

    public void writeFile(Path path, List<String> list)
            throws IOException {
        Files.write(path, list);
    }
}
