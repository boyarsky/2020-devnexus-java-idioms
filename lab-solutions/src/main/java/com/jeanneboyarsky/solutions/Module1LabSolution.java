package com.jeanneboyarsky.solutions;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Module1LabSolution {

    private PrintStream printStream;

    public Module1LabSolution(PrintStream printStream) {
        this.printStream = printStream;
    }

    public String pipeSeparatedValuesOfAllNoneWhitespaceStrings(String... strings) {
        List<String> values = new ArrayList<>();
        for(String current: strings) {
            if (! current.isBlank()) {
                values.add(current);
            }
        }
        return String.join("|", values);
    }

    public String threeCopiesOfFirstStringContainingNexus(List<String> strings) {
        for(String current: strings) {
            if (current.contains("Nexus")) {
                return current.repeat(3);
            }
        }
        return "";
    }

    public List<String> allCaseInsensitiveMatchesOfTree(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String current: strings) {
            if (current.equalsIgnoreCase("Tree")) {
                result.add(current);
            }
        }
        return result;
    }

    public void formatConstant(String label, double constant) {
        printStream.format("%s=%5.3f", label, constant);
    }

    public void printBlankTicTacToeBoard() {
        String solidLine = "-".repeat(10);
        String lineWithCells = "|  ".repeat(3) + "|";

        List<String> lines = new ArrayList<>();
        lines.add(solidLine);
        lines.add(lineWithCells);
        lines.add(lineWithCells);
        lines.add(solidLine);
        lines.add(lineWithCells);
        lines.add(lineWithCells);
        lines.add(solidLine);
        lines.add(lineWithCells);
        lines.add(lineWithCells);
        lines.add(solidLine);

        for(String line: lines) {
            printStream.format(line + "%n");
        }
    }
}
