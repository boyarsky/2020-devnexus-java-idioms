package com.jeanneboyarsky.solutions;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

public class Module4LabSolution {

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

    private PrintStream printStream;

    public Module4LabSolution(PrintStream printStream) {
        this.printStream = printStream;
    }

    public List<String> getPresenters(Map<String, Workshop> map, String title) {
        return map.values().stream()
                .filter(w -> w.getTitle().equals(title))
                .map(Workshop::getPresenters)
                .findFirst()
                .orElse(Collections.emptyList());
    }

    public List<String> getSessionKeysWithMultiplePresenters(Map<String, Workshop> map) {
        return map.entrySet().stream()
                .filter(e -> e.getValue().getPresenters().size() > 1)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }


    // everyone moves one floor up (ex: 200 -> 300)
    public void musicalRooms(Map<String, Workshop> map) {
        map.values().stream()
                .sorted(Comparator.comparing(Workshop::getRoomNumber))
                .forEach(w -> printStream.println(w.getTitle() + " to " + (w.getRoomNumber() + 100)));
    }

    public Optional<Integer> largestRoomNumberOnThirdFloor(Map<String, Workshop> map) {
        return map.values().stream()
                .map(Workshop::getRoomNumber)
                .filter(r -> r < 400)
                .max(Comparator.naturalOrder());
    }

    public Optional<String> titleOfRoomOneLowerThan(Map<String, Workshop> map, int roomNumber) {
        return map.values().stream()
                .filter(w -> w.getRoomNumber() < roomNumber)
                .sorted(Comparator.comparing(Workshop::getRoomNumber).reversed())
                .map(Workshop::getTitle)
                .findFirst();
    }

    public String getTitlesAsCsvWithPrefix(Map<String, Workshop> map, String prefix) {
        return map.values().stream()
                .map(Workshop::getTitle)
                .filter(t -> t.startsWith(prefix))
                .sorted()
                .collect(Collectors.joining(","));
    }

    public String musicalRoomsNewTitle(String text, int newRoom) {
        return text.lines()
                .filter(s -> s.contains(Integer.toString(newRoom)))
                .map(s -> s.replaceFirst("to.*$", ""))
                .map(String::trim)
                .findFirst()
                .orElse("");
    }
}
