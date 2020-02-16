package com.jeanneboyarsky.solutions;

import java.util.*;
import java.util.stream.Collectors;

public class Module5LabSolution {

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

    public String getAllPresentersSorted(Map<String, Workshop> map) {
        return map.values().stream()
                .map(Workshop::getPresenters)
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(";"));
    }

    // everyone moves one floor up (ex: 200 -> 300)
    public Map<Integer, String> musicalRooms(Map<String, Workshop> map) {
        return map.values().stream()
                .sorted(Comparator.comparing(Workshop::getRoomNumber))
                .collect(Collectors.toMap(w-> w.getRoomNumber() + 100, Workshop::getTitle));
    }

    public int largestRoomNumber(Map<String, Workshop> map) {
        return map.values().stream()
                .map(Workshop::getRoomNumber)
                .reduce(0, (a, b) -> a > b ? a : b);
    }

    public Map<Integer, Integer> largestRoomNumbersByFloor(Map<String, Workshop> map) {
        Comparator<String> comparator = Comparator.naturalOrder();
        return map.values().stream()
                .map(Workshop::getRoomNumber)
                .collect(Collectors.toMap(x -> x/100, x->x, (x,y) -> x > y ? x : y));
    }

    public Map<String, Optional<String>> largestRoomNumbersByFloorAsString(Map<String, Workshop> map) {
        Comparator<String> comparator = Comparator.naturalOrder();
        return map.values().stream()
                .map(Workshop::getRoomNumber)
                .map(Object::toString)
                .collect(Collectors.groupingBy(r -> "" + r.charAt(0), Collectors.maxBy(comparator)));
    }

    public Map<Integer, Integer> largestRoomNumbersByFloorCollectorVersion(Map<String, Workshop> map) {
        Comparator<String> comparator = Comparator.naturalOrder();
        return map.values().stream()
                .map(Workshop::getRoomNumber)
                .map(Object::toString)
                .collect(Collectors.groupingBy(r -> "" + r.charAt(0), Collectors.maxBy(comparator)))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().isPresent())
                .collect(Collectors.toMap(e -> Integer.parseInt(e.getKey()), e-> Integer.parseInt(e.getValue().get())));
    }
}
