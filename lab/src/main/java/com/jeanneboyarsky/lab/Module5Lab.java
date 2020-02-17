package com.jeanneboyarsky.lab;

import java.util.*;

public class Module5Lab {

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

    public String getAllPresentersSorted(Map<String, Workshop> map) {
        //TODO Implement using flatMap
        return null;
    }

    // everyone moves one floor up (ex: 200 -> 300)
    public Map<Integer, String> musicalRooms(Map<String, Workshop> map) {
        //TODO Implement using toMap
        return null;
    }

    public int largestRoomNumber(Map<String, Workshop> map) {
        //TODO Implement using reduce
        return 0;
    }

    public Map<Integer, Integer> largestRoomNumbersByFloor(Map<String, Workshop> map) {
        //TODO Implement using toMap
        return null;
    }

    public Map<String, Optional<String>> largestRoomNumbersByFloorAsString(Map<String, Workshop> map) {
        //TODO Implement using groupingBy
        return null;
    }

    // challenge question: this is tricky!
    public Map<Integer, Integer> largestRoomNumbersByFloorCollectorVersion(Map<String, Workshop> map) {
        //TODO Implement using toMap
        return null;
    }
}
