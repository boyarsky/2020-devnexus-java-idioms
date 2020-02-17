package com.jeanneboyarsky.lab;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class Module6Lab {

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

    // format: key,room,"title","presenters"
    public void writeWorkshopsSortedByRoomNumber(Map<String, Workshop> map, Path outputPath) {
        // TODO Implement without using a loop
    }

    // re-order so all lines with odd room numbers are first (keeping sort order within odds)
    // followed by all even room numbers (keeping sort order within evens)
    // write the result back to the file
    public void musicalRooms(Path path) throws IOException {
        // TODO Implement without using a loop or reading the file multiple times
    }

    public Optional<String> shortestLine(Path path) throws IOException {
        // TODO Implement calling lines()
        return null;
    }

    public void musicalRoomsStreamVersion(Path path) throws IOException {
        // TODO Implement calling lines() twice
    }

    public boolean deleteFileIfNotAbsolutePath(Path path) throws IOException {
        // TODO Implement
        return false;
    }

    // challenge
    public Optional<String> absolutePathOfLargestLabSolutionFile() throws IOException {
        // TODO Implement using walk()
        return null;
    }
}
