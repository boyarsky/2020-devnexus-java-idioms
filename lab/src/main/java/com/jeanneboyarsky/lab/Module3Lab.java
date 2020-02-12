package com.jeanneboyarsky.lab;

import java.io.PrintStream;
import java.util.*;

public class Module3Lab {

    public static class Workshop {
        private String title;
        private int roomNumber;
        private List<String> presenters;

        public Workshop(String title, int roomNumber, String... presenters) {
            this.title = title;
            this.roomNumber = roomNumber;
            //TODO implement
        }

        public String getTitle() {
            return title;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public List<String> getPresenters() {
            //TODO implement
            return null;
        }
    }

    private PrintStream printStream;

    public Module3Lab(PrintStream printStream) {
        this.printStream = printStream;
    }


    public Optional<Workshop> getOptionalByKey(Map<String, Workshop> map, String key) {
        //TODO implement without using an if statement, loop or stream
        return null;
    }

    public List<String> getPresenters(Map<String, Workshop> map, String title) {
        //TODO implement without using an if statement, loop or stream (ternary operator is ok)
        return null;
    }

    public List<String> getSessionKeysWithMultiplePresenters(Map<String, Workshop> map) {
        //TODO implement without using an if statement, loop or stream
        return null;
    }


    // everyone moves one floor up (ex: 200 -> 300)
    // challenge: how many ways can you write this without a loop or stream [forEach() is ok]
    public void musicalRooms(Map<String, Workshop> map) {
       //TODO implement as many ways as you can without using an if statement loop or stream [forEach() is ok]
    }

}
