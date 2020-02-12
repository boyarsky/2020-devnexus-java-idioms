package com.jeanneboyarsky.solutions;

import java.io.PrintStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module3LabSolution {

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

    public Module3LabSolution(PrintStream printStream) {
        this.printStream = printStream;
    }


    public Optional<Workshop> getOptionalByKey(Map<String, Workshop> map, String key) {
        Workshop workshop = map.getOrDefault(key, null);
        return Optional.ofNullable(workshop);
    }

    public List<String> getPresenters(Map<String, Workshop> map, String title) {
        List<Workshop> values = new ArrayList<>(map.values());
        values.removeIf(w -> ! w.getTitle().equals(title));
        return values.isEmpty() ? List.of() : values.get(0).getPresenters();
    }

    public List<String> getSessionKeysWithMultiplePresenters(Map<String, Workshop> map) {
        List<String> keys = new ArrayList<>(map.keySet());
        keys.removeIf(k ->map.get(k).presenters.size() == 1);
        keys.sort(Comparator.reverseOrder());
        return keys;
    }


    // everyone moves one floor up (ex: 200 -> 300)
    // challenge: how many ways can you write this without a loop or stream [forEach() is ok]
    public void musicalRooms(Map<String, Workshop> map) {
        List<Workshop> values = new ArrayList<>(map.values());
        Collections.sort(values, Comparator.comparing(Workshop::getRoomNumber));
        values.forEach(w -> printStream.println(w.getTitle() + " to " + (w.getRoomNumber() + 100)));
    }

}
