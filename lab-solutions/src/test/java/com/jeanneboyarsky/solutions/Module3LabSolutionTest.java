package com.jeanneboyarsky.solutions;

import com.jeanneboyarsky.rules.CodeRulesForMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static com.jeanneboyarsky.solutions.Module3LabSolution.*;
import static org.junit.jupiter.api.Assertions.*;

public class Module3LabSolutionTest {

    private Module3LabSolution target;
    private Map<String, Workshop> workshops;
    private ByteArrayOutputStream mock;
    private CodeRulesForMethods codeRules;

    @BeforeEach
    void setUp() {
        mock = new ByteArrayOutputStream();
        target = new Module3LabSolution(new PrintStream((mock)));

        Path folder = Paths.get("lab-solutions/src/main/java/");
        codeRules = new CodeRulesForMethods(folder, "com.jeanneboyarsky.solutions",
                "Module3LabSolution.java");
    }

    @BeforeEach
    void devNexusWorkshops() {
        workshops = Map.ofEntries(
                Map.entry("Kotlin",
                        new Workshop("Kotlin Full Day Workshop", 302,
                                "Kenneth Kousen")),
                Map.entry("TDD",
                        new Workshop("Test Driven Development: From Principles to Practice", 303
                                , "Venkat Subramaniam")),
                Map.entry("Idioms",
                        new Workshop("Java Idioms for becoming a more powerful developer", 304,
                                "Jeanne Boyarsky")),
                Map.entry("Security",
                        new Workshop("Java Security Workshop", 305,
                                "Steve Poole", "Brian Vermeer")),
                Map.entry("Advanced-Kubernetes",
                        new Workshop("Advanced Kubernetes workshop", 311,
                                "Adarsh Shah")),
                Map.entry("Kubernetes-101",
                        new Workshop("Kubernetes 101 Workshop", 312,
                                "JJ Asghar")),
                Map.entry("CloudNativeMicroprofile",
                        new Workshop("Cloud Native Microservice with MicroProfile, Docker, Kubernetes, Istio and Open Shift",
                                313, "Emily Jiang")),
                Map.entry("Quarkus",
                        new Workshop("The Quarkus Tutorial", 314,
                                "Edson Yanaga")),
                Map.entry("SpringBoot",
                        new Workshop("Extending Spring Boot for Enterprise", 315,
                                "Billy Korando")),
                Map.entry("Microservices",
                        new Workshop("Responsible Microservices Architecture", 403,
                                "Nathaniel Schutta")),
                Map.entry("DDD",
                        new Workshop("Domain Driven Design Workshop", 404,
                                "Rob Curry", "Kelly Morrison", "Tony Stuchel", "Steve Fordham", "Sharma Vedula")),
                Map.entry("CloudNativeSpringBoot",
                        new Workshop("Google Cloud Native with Spring Boot", 405,
                                "Ray Tsang", "James Ward")));
    }

    // ---------------------------------------------------------

    @Test
    void constructor() {
        Workshop actual = new Workshop("title", 999, "speaker");
        assertEquals("title", actual.getTitle());
        assertEquals(999, actual.getRoomNumber());
        List<String> presenters = actual.getPresenters();
        assertEquals(1, presenters.size(), "# presenters");
        assertEquals("speaker", presenters.get(0));
    }

    @Test
    void constructorParameterDoesNotAffectValue() {
        String[] array = new String[] { "original"};
        Workshop actual = new Workshop("title", 999, array);
        array[0] = "new";
        List<String> presenters = actual.getPresenters();
        assertEquals(1, presenters.size(), "# presenters");
        assertEquals("original", presenters.get(0));
    }

    @Test
    void getPresentersImmutable() {
        Workshop actual = new Workshop("title", 999, "speaker");
        List<String> presenters1 = actual.getPresenters();
        List<String> presenters2 = actual.getPresenters();
        assertNotSame(presenters1, presenters2);
    }

    // ---------------------------------------------------------

    @Test
    void getOptionalByKey_match() {
        Optional<Workshop> actual = target.getOptionalByKey(workshops, "Kotlin");
        assertEquals("Kotlin Full Day Workshop", actual.get().getTitle());
    }

    @Test
    void getOptionalByKey_noMatch() {
        Optional<Workshop> actual = target.getOptionalByKey(workshops, "Bad");
        assertFalse(actual.isPresent());
    }

    @Test
    void requirements_getOptionalByKey() {
        assertFalse(codeRules.containsIf("getOptionalByKey"),
                "cannot contain if statement");
        assertFalse(codeRules.containsLoop("getOptionalByKey"),
                "cannot contain a loop");
        assertFalse(codeRules.containsStream("getOptionalByKey"),
                "cannot contain stream");
    }

    // ---------------------------------------------------------

    @Test
    void getPresenters_foundSingle() {
        List<String> expected = List.of("Billy Korando");
        List<String> actual = target.getPresenters(workshops, "Extending Spring Boot for Enterprise");
        assertEquals(expected, actual);
    }

    @Test
    void getPresenters_foundTwo() {
        List<String> expected = List.of("Ray Tsang", "James Ward");
        List<String> actual = target.getPresenters(workshops, "Google Cloud Native with Spring Boot");
        assertEquals(expected, actual);
    }

    @Test
    void getPresenters_foundNone() {
        List<String> actual = target.getPresenters(workshops, "Bad");
        assertEquals(0, actual.size());
    }

    @Test
    void requirements_getPresenters() {
        assertFalse(codeRules.containsIf("getPresenters"),
                "cannot contain if statement");
        assertFalse(codeRules.containsLoop("getPresenters"),
                "cannot contain a loop");
        assertFalse(codeRules.containsStream("getPresenters"),
                "cannot contain stream");
    }

    // ---------------------------------------------------------

    @Test
    void getSessionKeysWithMultiplePresenters() {
        List<String> expected = List.of("Security", "DDD", "CloudNativeSpringBoot");
        List<String> actual = target.getSessionKeysWithMultiplePresenters(workshops);
        assertEquals(expected, actual);
    }

    @Test
    void requirements_getSessionKeysWithMultiplePresenters() {
        assertFalse(codeRules.containsIf("getSessionKeysWithMultiplePresenters"),
                "cannot contain if statement");
        assertFalse(codeRules.containsLoop("getSessionKeysWithMultiplePresenters"),
                "cannot contain a loop");
        assertFalse(codeRules.containsStream("getSessionKeysWithMultiplePresenters"),
                "cannot contain stream");
    }

    // ---------------------------------------------------------

    @Test
    void musicalRooms() {
        target.musicalRooms(workshops);
        String actual = mock.toString();
        String expected = "Kotlin Full Day Workshop to 402\n" +
                "Test Driven Development: From Principles to Practice to 403\n" +
                "Java Idioms for becoming a more powerful developer to 404\n" +
                "Java Security Workshop to 405\n" +
                "Advanced Kubernetes workshop to 411\n" +
                "Kubernetes 101 Workshop to 412\n" +
                "Cloud Native Microservice with MicroProfile, Docker, Kubernetes, Istio and Open Shift to 413\n" +
                "The Quarkus Tutorial to 414\n" +
                "Extending Spring Boot for Enterprise to 415\n" +
                "Responsible Microservices Architecture to 503\n" +
                "Domain Driven Design Workshop to 504\n" +
                "Google Cloud Native with Spring Boot to 505\n";
        assertEquals(expected, actual);
    }

    @Test
    void requirements_musicalRooms() {
        assertFalse(codeRules.containsIf("musicalRooms"),
                "cannot contain if statement");
        assertFalse(codeRules.containsLoop("musicalRooms"),
                "cannot contain a loop");
        assertFalse(codeRules.containsStream("musicalRooms"),
                "cannot contain stream");
    }


}
