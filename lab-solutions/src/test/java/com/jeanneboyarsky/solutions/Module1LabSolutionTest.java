package com.jeanneboyarsky.solutions;

import com.jeanneboyarsky.rules.CodeRulesForMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Module1LabSolutionTest {

    private Module1LabSolution target;
    private ByteArrayOutputStream mock;
    private CodeRulesForMethods codeRules;

    @BeforeEach
    void setUp() {
        mock = new ByteArrayOutputStream();
        target = new Module1LabSolution(new PrintStream((mock)));

        Path folder = Paths.get("lab-solutions/src/main/java/");
        codeRules = new CodeRulesForMethods(folder, "com.jeanneboyarsky.solutions",
                "Module1LabSolution.java");
    }

    // ---------------------------------------------------------

    @Test
    void pipeSeparatedValuesOfAllNoneWhitespaceStrings() {
        String expected = "sea lion|penguin";
        String actual = target.pipeSeparatedValuesOfAllNoneWhitespaceStrings("sea lion", "  ", "penguin", "", "");
        assertEquals(expected, actual);
    }

    @Test
    void pipeSeparatedValuesOfAllNoneWhitespaceStrings_noMatches() {
        String expected = "";
        String actual = target.pipeSeparatedValuesOfAllNoneWhitespaceStrings(" ", "", "");
        assertEquals(expected, actual);
    }

    @Test
    void requirements_pipeSeparatedValuesOfAllNoneWhitespaceStrings() {
        assertFalse(codeRules.containsStream("pipeSeparatedValuesOfAllNoneWhitespaceStrings"),
                "cannot contain stream");
        assertFalse(codeRules.containsLambda("pipeSeparatedValuesOfAllNoneWhitespaceStrings"),
                "cannot contain lambda");
        assertFalse(codeRules.containsMethodReference("pipeSeparatedValuesOfAllNoneWhitespaceStrings"),
                "cannot contain method reference");
    }

    // ---------------------------------------------------------

    @Test
    void threeCopiesOfFirstStringContainingNexus() {
        List<String> list = List.of("Braves", "DevNexus", "Nexus");
        String expected = "DevNexusDevNexusDevNexus";
        String actual = target.threeCopiesOfFirstStringContainingNexus(list);
        assertEquals(expected, actual);
    }

    @Test
    void threeCopiesOfFirstStringContainingNexus_noMatches() {
        List<String> list = List.of("braves", "nexus");
        String expected = "";
        String actual = target.threeCopiesOfFirstStringContainingNexus(list);
        assertEquals(expected, actual);
    }

    @Test
    void requirements_threeCopiesOfFirstStringContainingNexus() {
        assertFalse(codeRules.containsStream("threeCopiesOfFirstStringContainingNexus"),
                "cannot contain stream");
        assertFalse(codeRules.containsLambda("threeCopiesOfFirstStringContainingNexus"),
                "cannot contain lambda");
        assertFalse(codeRules.containsMethodReference("threeCopiesOfFirstStringContainingNexus"),
                "cannot contain method reference");
    }

    // ---------------------------------------------------------

    @Test
    void allCaseInsensitiveMatchesOfTree() {
        List<String> list = List.of("Tree", "TreeHouse", "tree");
        List<String> expected = List.of("Tree", "tree");
        List<String> actual = target.allCaseInsensitiveMatchesOfTree(list);
        assertEquals(expected, actual);
    }

    @Test
    void requirements_allCaseInsensitiveMatchesOfTree() {
        assertFalse(codeRules.containsStream("allCaseInsensitiveMatchesOfTree"),
                "cannot contain stream");
        assertFalse(codeRules.containsLambda("allCaseInsensitiveMatchesOfTree"),
                "cannot contain lambda");
        assertFalse(codeRules.containsMethodReference("allCaseInsensitiveMatchesOfTree"),
                "cannot contain method reference");
    }

    // ---------------------------------------------------------

    @Test
    void formatting() {
        target.formatConstant("e", 2.7182818284);
        String expected = "e=2.718";
        String actual = mock.toString();
        assertEquals(expected, actual);
    }

    @Test
    void requirements_formatConstant() {
        assertFalse(codeRules.containsLoop("formatConstant"),
                "cannot contain loop");
        assertFalse(codeRules.containsPrintMethod("formatConstant"),
                "cannot contain print");
        assertFalse(codeRules.containsNewLine("formatConstant"),
                "cannot contain new line");
    }

    // ---------------------------------------------------------

    @Test
    void printBlankTicTacToeBoard() {
        target.printBlankTicTacToeBoard();
        String expected = "----------\n"
                        + "|  |  |  |\n"
                        + "|  |  |  |\n"
                        + "----------\n"
                        + "|  |  |  |\n"
                        + "|  |  |  |\n"
                        + "----------\n"
                        + "|  |  |  |\n"
                        + "|  |  |  |\n"
                        + "----------\n";
        String actual = mock.toString();
        assertEquals(expected, actual);
    }

    @Test
    void requirements_printBlankTicTacToeBoard() {
        assertEquals(1, codeRules.countLoops("printBlankTicTacToeBoard"),
                "must contain exactly one loop");
        assertFalse(codeRules.containsPrintMethod("printBlankTicTacToeBoard"),
                "cannot contain print");
        assertFalse(codeRules.containsNewLine("printBlankTicTacToeBoard"),
                "cannot contain new line");
    }
}
