package com.jeanneboyarsky.lab;

import java.io.PrintStream;
import java.util.Collections;
import java.util.List;

public class Module1Lab {

    private PrintStream printStream;

    public Module1Lab(PrintStream printStream) {
        this.printStream = printStream;
    }

    public String pipeSeparatedValuesOfAllNoneWhitespaceStrings(String... strings) {
        //TODO implement so tests pass (do not use lambda/stream)
       return "";
    }

    public String threeCopiesOfFirstStringContainingNexus(List<String> strings) {
        //TODO implement so tests pass (do not use lambda/stream)
        return "";
    }

    public List<String> allCaseInsensitiveMatchesOfTree(List<String> strings) {
        //TODO implement so tests pass (do not use lambda/stream)
        return Collections.emptyList();
    }

    public void formatConstant(String label, double constant) {
        //TODO implement so tests pass (do not use loops, print, println or \n)
    }

    /*
     * Challenge question
     */
    public void printBlankTicTacToeBoard() {
        //TODO implement so tests pass using exactly one loop at the end (do not use print, println or \n)
    }
}