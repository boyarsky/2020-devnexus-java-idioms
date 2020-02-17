package com.jeanneboyarsky.solutions;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Module7LabSolution {

    public static class Workshop {
        private String title;
        private int roomNumber;
        private List<String> presenters;

        public Workshop(String title, int roomNumber, String... presenters) {
            this.title = title;
            this.roomNumber = roomNumber;
            this.presenters = new ArrayList(Arrays.asList(presenters));
        }

        public String getTitle() {
            return title;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public List<String> getPresenters() {
            return List.copyOf(presenters);
        }
    }

    // build the date for today: February 19, 2020
    public LocalDate startOfDevNexus() {
        return LocalDate.of(2020, Month.FEBRUARY, 19);
    }

    // add days to start to get last day of Dev Nexus
    public LocalDate endOfDevNexus() {
        return startOfDevNexus().plusDays(2);
    }

    public List<Integer> roomNumbersSmallerThan(Map<String, Workshop> map, int max) {
        return map.values().stream()
                .map(Workshop::getRoomNumber)
                .filter(n -> Math.min(n, max) == n)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> getFiveRandomSessions(Map<String, Workshop> map) {
        List<Workshop> workshops = new ArrayList<>(map.values());
        Random random = new Random();
        return Stream.generate(() -> random.nextInt(workshops.size()))
                .map(n -> workshops.get(n))
                .map(Workshop::getRoomNumber)
                .distinct()
                .limit(5)
                .collect(Collectors.toList());
    }

}
