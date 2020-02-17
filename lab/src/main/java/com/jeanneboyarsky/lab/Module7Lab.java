package com.jeanneboyarsky.lab;

import com.jeanneboyarsky.solutions.Module7LabSolution;

import java.time.LocalDate;
import java.util.*;

public class Module7Lab {

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

    // build the date for today: February 19, 2020
    public LocalDate startOfDevNexus() {
        //TODO implement by hardocding LocalDate
        return null;
    }

    // add days to start to get last day of Dev Nexus
    public LocalDate endOfDevNexus() {
        //TODO implement by performing date arithmetic
        return null;
    }

    public List<Integer> roomNumbersSmallerThan(Map<String, Workshop> map, int max) {
       //TODO implement using a stream and Math.min
        return null;
    }

    // challenge
    public List<Integer> getFiveRandomSessions(Map<String, Workshop> map) {
        //TODO implement to return any 5 random sessions (no duplicates)
        return null;
    }

}
