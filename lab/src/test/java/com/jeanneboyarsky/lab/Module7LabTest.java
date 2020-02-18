package com.jeanneboyarsky.lab;

import com.jeanneboyarsky.rules.CodeRulesForMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.jeanneboyarsky.lab.Module7Lab.Workshop;
import static org.junit.jupiter.api.Assertions.*;

public class Module7LabTest {

    private Module7Lab target;
    private Map<String, Workshop> workshops;
    private CodeRulesForMethods codeRules;

    @BeforeEach
    void setUp() {
        target = new Module7Lab();
        Path folder = Paths.get("lab/src/main/java/");
        codeRules = new CodeRulesForMethods(folder, "com.jeanneboyarsky.lab",
                "Module7Lab.java");
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
    void startOfDevNexus() {
        LocalDate actual = target.startOfDevNexus();
        assertEquals(2020, actual.getYear());
        assertEquals(Month.FEBRUARY, actual.getMonth());
        assertEquals(19, actual.getDayOfMonth());
    }

    @Test
    void endOfDevNexus() {
        LocalDate actual = target.endOfDevNexus();
        assertEquals(2020, actual.getYear());
        assertEquals(Month.FEBRUARY, actual.getMonth());
        assertEquals(21, actual.getDayOfMonth());
    }

    @Test
    void roomNumbersSmallerThan() {
        List<Integer> expected = List.of(302, 303, 304, 305);
        List<Integer> actual = target.roomNumbersSmallerThan(workshops,310);
        assertEquals(expected, actual);
    }

    @Test
    void requirements_roomNumbersSmallerThan() {
        assertTrue(codeRules.containsStream("roomNumbersSmallerThan"),
                "must contain stream");
        assertTrue(codeRules.containsMathMin("roomNumbersSmallerThan"),
                "must contain Math.min");
    }

    @RepeatedTest(100)
    void getFiveRandomSessions() {
        List<Integer> actual = target.getFiveRandomSessions(workshops);
        Set<Integer> unique = new HashSet<>(actual);
        assertEquals(5, unique.size());
    }
}

