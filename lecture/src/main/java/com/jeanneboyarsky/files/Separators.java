package com.jeanneboyarsky.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.stream.Collectors;

public class Separators {


    public void print() throws IOException {
        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("path.separator"));
    }

}
