package com.jeanneboyarsky.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Module2LabTest {

    private Module2Lab target;

    @BeforeEach
    void setUp() {
        target = new Module2Lab();
    }

    // ---------------------------------------------------------

    @Test
    void getMiddleName() {
        String text = "Mickey Theodore Mouse";
        Optional<String> actual = target.getMiddleName(text);
        assertEquals("Theodore", actual.orElse(""));
    }

    @Test
    void getMiddleName_fotFound() {
        String text = "Pluto";
        Optional<String> actual = target.getMiddleName(text);
        assertFalse(actual.isPresent());
    }

    // ---------------------------------------------------------

    @Test
    void getAllDistinctNumbers() {
        String text = "There are 100 times 10 in a 1000. Really 1000";
        Collection<Integer> expected = Set.of(10, 100, 1000);
        Collection<Integer> actual = target.getAllDistinctNumbers(text);
        assertEquals(expected, actual);
    }

    @Test
    void getAllDistinctNumbersEvenUnderscores() {
        String text = "There are 100 times 10 in a 1_000. Really 1000";
        Collection<Integer> expected = Set.of(10, 100, 1000);
        Collection<Integer> actual = target.getAllDistinctNumbersEvenUnderscores(text);
        assertEquals(expected, actual);
    }

    // ---------------------------------------------------------

    @Test
    void removeNameInOneLine_ifPresent() {
        String text = "Title: Ms\n" +
                "Name: Jeanne\n" +
                "Role: Speaker";
        String expected = "Title: Ms\n" +
                "Name:\n" +
                "Role: Speaker";
        String actual = target.removeNameInOneLine(text);
        assertEquals(expected, actual);
    }

    @Test
    void removeNameInOneLine_ifMissing() {
        String text = "Title: Ms\n" +
                "Role: Speaker";
        String expected = "Title: Ms\n" +
                "Role: Speaker";
        String actual = target.removeNameInOneLine(text);
        assertEquals(expected, actual);
    }

    @Test
    void removeNameInOneLine_forNulLNamAndNoSpaceAfterColon() {
        String text = "Title: Ms\n" +
                "Name:Jeanne Boyarsky\n" +
                "Role: Speaker";
        String expected = "Title: Ms\n" +
                "Name:\n" +
                "Role: Speaker";
        String actual = target.removeNameInOneLine(text);
        assertEquals(expected, actual);
    }

    // ---------------------------------------------------------

    @Test
    void removeNameWithPattern_ifPresent() {
        String text = "Title: Ms\n" +
                "Name: Jeanne\n" +
                "Role: Speaker";
        String expected = "Title: Ms\n" +
                "Name:\n" +
                "Role: Speaker";
        String actual = target.removeNameWithPattern(text);
        assertEquals(expected, actual);
    }

    @Test
    void removeNameWithPattern_ifMissing() {
        String text = "Title: Ms\n" +
                "Role: Speaker";
        String expected = "Title: Ms\n" +
                "Role: Speaker";
        String actual = target.removeNameWithPattern(text);
        assertEquals(expected, actual);
    }

    @Test
    void removeNameWithPattern_forNulLNamAndNoSpaceAfterColon() {
        String text = "Title: Ms\n" +
                "Name:Jeanne Boyarsky\n" +
                "Role: Speaker";
        String expected = "Title: Ms\n" +
                "Name:\n" +
                "Role: Speaker";
        String actual = target.removeNameWithPattern(text);
        assertEquals(expected, actual);
    }

    // ---------------------------------------------------------

    @Test
    void removeStarsFromFrontAndBack() {
        assertEquals("x", target.removeStarsFromFrontAndBack("x"));
        assertEquals("name", target.removeStarsFromFrontAndBack("**** name"));
        assertEquals("name", target.removeStarsFromFrontAndBack(" name *****"));
        assertEquals("name", target.removeStarsFromFrontAndBack("**** name *****"));
        assertEquals("x *** x", target.removeStarsFromFrontAndBack("**** x *** x *****"));
    }


}
