package com.jeanneboyarsky.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Module1LabTest {

    private Module1Lab target;
    private ByteArrayOutputStream mock;

    @BeforeEach
    void setUp() {
        mock = new ByteArrayOutputStream();
        target = new Module1Lab(new PrintStream((mock)));
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

    // ---------------------------------------------------------

    @Test
    void allCaseInsensitiveMatchesOfTree() {
        List<String> list = List.of("Tree", "TreeHouse", "tree");
        List<String> expected = List.of("Tree", "tree");
        List<String> actual = target.allCaseInsensitiveMatchesOfTree(list);
        assertEquals(expected, actual);
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
}
