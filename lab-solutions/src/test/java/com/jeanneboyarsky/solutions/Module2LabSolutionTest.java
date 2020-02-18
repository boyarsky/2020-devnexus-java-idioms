package com.jeanneboyarsky.solutions;

import com.jeanneboyarsky.rules.CodeRulesForMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class Module2LabSolutionTest {

    private Module2LabSolution target;
    private CodeRulesForMethods codeRules;

    @BeforeEach
    void setUp() {
        target = new Module2LabSolution();

        Path folder = Paths.get("lab-solutions/src/main/java/");
        codeRules = new CodeRulesForMethods(folder, "com.jeanneboyarsky.solutions",
                "Module2LabSolution.java");
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

    @Test
    void requirements_getMiddleName() {
        assertTrue(codeRules.containsOptionalEmpty("getMiddleName"),
                "must contain Optional.empty");
        assertTrue(codeRules.containsOptionalEmpty("getMiddleName"),
                "must contain Optional.of");
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

    @Test
    void requirements_removeNameInOneLine() {
        assertEquals(1, codeRules.numberNonCommentedOutLines("removeNameInOneLine"),
                "must be one line");
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

    @Test
    void requirements_removeNameWithPattern() {
        assertEquals(1, codeRules.countLoops("removeNameWithPattern"),
                "must be exactly loop");
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

    @Test
    void requirements_removeStarsFromFrontAndBack() {
        assertFalse(codeRules.containsLoop("removeStarsFromFrontAndBack"),
                "must not contain loop");
    }
}
