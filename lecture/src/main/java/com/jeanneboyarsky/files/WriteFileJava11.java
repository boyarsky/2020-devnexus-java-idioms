package com.jeanneboyarsky.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileJava11 {


    public void writeFromString(Path path, String text)
            throws IOException {

        Files.writeString(path, text);
    }
}
