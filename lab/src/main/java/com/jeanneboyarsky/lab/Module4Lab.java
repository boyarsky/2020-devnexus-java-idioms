package com.jeanneboyarsky.lab;

import com.jeanneboyarsky.solutions.Module4LabSolution;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

public class Module4Lab {

    public static class Workshop {
        private String title;
        private int roomNumber;
        private List<String> presenters;

        public Workshop(String title, int roomNumber, String... presenters) {
            this.title = title;
            this.roomNumber = roomNumber;
            //TODO implement (copy from module 3)
        }

        public String getTitle() {
            return title;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public List<String> getPresenters() {
            //TODO implement (copy from module 3)
            return null;
        }
    }

    private PrintStream printStream;

    public Module4Lab(PrintStream printStream) {
        this.printStream = printStream;
    }

    public List<String> getPresenters(Map<String, Workshop> map, String title) {
        //TODO implement with streams (no removeIf() or if statements or loops)
        return null;
    }

    public List<String> getSessionKeysWithMultiplePresenters(Map<String, Workshop> map) {
        //TODO implement with streams (no removeIf() or if statements or loops)
        return null;
    }


    // everyone moves one floor up (ex: 200 -> 300)
    // challenge: how many ways can you write this without a loop or stream [forEach() is ok]
    public void musicalRooms(Map<String, Workshop> map) {
        //TODO implement with streams (no removeIf() or if statements or loops)
    }

    public Optional<Integer> largestRoomNumberOnThirdFloor(Map<String, Workshop> map) {
        //TODO implement with streams (no removeIf() or if statements or loops)
        return null;
    }

    public Optional<String> titleOfRoomOneLowerThan(Map<String, Workshop> map, int roomNumber) {
        //TODO implement with streams (no removeIf() or if statements or loops)
        return null;
    }

    public String getTitlesAsCsvWithPrefix(Map<String, Workshop> map, String prefix) {
        //TODO implement with streams (no removeIf() or if statements or loops)
        return null;
    }

    public String musicalRoomsNewTitle(String text, int newRoom) {
        //TODO implement with streams (no removeIf() or if statements or loops)
        return null;
    }
}
