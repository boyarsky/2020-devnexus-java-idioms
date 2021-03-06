package com.jeanneboyarsky.solutions;

import com.jeanneboyarsky.rules.CodeRulesForMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Optional;

import static com.jeanneboyarsky.solutions.Module5LabSolution.Workshop;
import static org.junit.jupiter.api.Assertions.*;

public class Module5LabSolutionTest {

    private Module5LabSolution target;
    private Map<String, Workshop> workshops;
    private CodeRulesForMethods codeRules;

    @BeforeEach
    void setUp() {
        target = new Module5LabSolution();
        Path folder = Paths.get("lab-solutions/src/main/java/");
        codeRules = new CodeRulesForMethods(folder, "com.jeanneboyarsky.solutions",
                "Module5LabSolution.java");
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
    void getAllPresentersSorted() {
        String expected = "Adarsh Shah;Billy Korando;Brian Vermeer;Edson Yanaga;Emily Jiang;JJ Asghar;James Ward;Jeanne Boyarsky;Kelly Morrison;Kenneth Kousen;Nathaniel Schutta;Ray Tsang;Rob Curry;Sharma Vedula;Steve Fordham;Steve Poole;Tony Stuchel;Venkat Subramaniam";
        String actual = target.getAllPresentersSorted(workshops);
        assertEquals(expected, actual);
    }

    @Test
    void requirements_getAllPresentersSorted() {
        assertTrue(codeRules.containsFlatMap("getAllPresentersSorted"),
                "must contains flatMap()");
    }
    // ---------------------------------------------------------

    @Test
    void musicalRooms() {
        Map<Integer, String> actual = target.musicalRooms(workshops);
        assertEquals("Kotlin Full Day Workshop", actual.get(402));
        assertEquals("Kubernetes 101 Workshop", actual.get(412));
        assertEquals("Domain Driven Design Workshop", actual.get(504));
    }

    @Test
    void requirements_musicalRooms() {
        assertTrue(codeRules.containsToMap("musicalRooms"),
                "must contains toMap()");
    }

    // ---------------------------------------------------------

    @Test
    void largestRoomNumber() {
        int actual = target.largestRoomNumber(workshops);
        assertEquals(405, actual);
    }

    @Test
    void requirements_largestRoomNumber() {
        assertTrue(codeRules.containsReduce("largestRoomNumber"),
                "must contains reduce()");
    }

    // ---------------------------------------------------------

    @Test
    void largestRoomNumbersByFloor() {
        Map<Integer, Integer> actual = target.largestRoomNumbersByFloor(workshops);
        assertEquals(315, actual.get(3));
        assertEquals(405, actual.get(4));
        assertNull( actual.get(2));
    }

    @Test
    void requirements_largestRoomNumbersByFloor() {
        assertTrue(codeRules.containsToMap("largestRoomNumbersByFloor"),
                "must contains toMap()");
    }

    // ---------------------------------------------------------

    @Test
    void largestRoomNumbersByFloorAsString() {
        Map<String, Optional<String>> actual = target.largestRoomNumbersByFloorAsString(workshops);
        assertEquals("315", actual.get("3").get());
        assertEquals("405", actual.get("4").get());
        assertNull(actual.get("2"));
    }

    @Test
    void requirements_largestRoomNumbersByFloorAsString() {
        assertTrue(codeRules.containsGroupingBy("largestRoomNumbersByFloorAsString"),
                "must contains groupingBy()");
    }

    // ---------------------------------------------------------

    @Test
    void largestRoomNumbersByFloorCollectorVersion() {
        Map<Integer, Integer> actual = target.largestRoomNumbersByFloorCollectorVersion(workshops);
        assertEquals(315, actual.get(3));
        assertEquals(405, actual.get(4));
        assertNull( actual.get(2));
    }

    @Test
    void requirements_largestRoomNumbersByFloorCollectorVersion() {
        assertTrue(codeRules.containsToMap("largestRoomNumbersByFloorCollectorVersion"),
                "must contains toMap()");
    }

}

