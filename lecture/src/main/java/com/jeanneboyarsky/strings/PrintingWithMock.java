package com.jeanneboyarsky.strings;

import java.io.PrintStream;

public class PrintingWithMock {

    private PrintStream stream;

    public PrintingWithMock() {
        this(System.out);
    }

    PrintingWithMock(PrintStream stream) {
        this.stream = stream;
    }

   public void helloAtlanta() {
       stream.print("Hello Atlanta");
   }
}
