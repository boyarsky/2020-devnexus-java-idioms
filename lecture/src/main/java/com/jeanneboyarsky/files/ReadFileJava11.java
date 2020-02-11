package com.jeanneboyarsky.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileJava11 {


    public String readIntoString(Path path) throws IOException {
        return Files.readString(path);
    }
}
