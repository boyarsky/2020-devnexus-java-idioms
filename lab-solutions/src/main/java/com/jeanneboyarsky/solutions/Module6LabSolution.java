package com.jeanneboyarsky.solutions;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class Module6LabSolution {

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

        public String toCsv() {
            // tip: use library commons csv in real code
            StringBuilder result = new StringBuilder();
            result.append(roomNumber);
            result.append(',');
            result.append('"');
            result.append(title);
            result.append('"');
            result.append(',');
            result.append('"');
            result.append(presenters.stream().collect(Collectors.joining(",")));
            result.append('"');
            return result.toString();
        }
    }

    // format: key,room,"title","presenters"
    public void writeWorkshopsSortedByRoomNumber(Map<String, Workshop> map, Path outputPath) {
        List<String> lines = map.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().getRoomNumber()))
                .map(e -> e.getKey() + "," + e.getValue().toCsv())
                .collect(Collectors.toList());
        try {
            Files.write(outputPath, lines);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    // re-order so all lines with odd room numbers are first (keeping sort order within odds)
    // followed by all even room numbers (keeping sort order within evens)
    // write the result back to the file
    public void musicalRooms(Path path) throws IOException {
        List<String> initialData = Files.readAllLines(path);
        List<String> oddRoomNumbers = new ArrayList<>(initialData);
        oddRoomNumbers.removeIf(s -> ! isOddRoomNumber(s));
        List<String> evenRoomNumbers = new ArrayList<>(initialData);
        evenRoomNumbers.removeIf(s -> isOddRoomNumber(s));

        List<String> result = new ArrayList<>(oddRoomNumbers);
        result.addAll(evenRoomNumbers);
        Files.write(path, result);
    }

    private boolean isOddRoomNumber(String line) {
        String roomCell = line.split(",")[1];
        return Integer.parseInt(roomCell) %2 != 0;
    }

    public Optional<String> shortestLine(Path path) throws IOException {
        return Files.lines(path)
                .min(Comparator.comparing(String::length));
    }

    public void musicalRoomsStreamVersion(Path path) throws IOException {
        List<String> odd = Files.lines(path)
                .filter(l -> isOddRoomNumber(l))
                .collect(Collectors.toList());
        List<String> even = Files.lines(path)
                .filter(l -> ! isOddRoomNumber(l))
                .collect(Collectors.toList());
        Files.write(path, odd);
        Files.write(path, even, StandardOpenOption.APPEND);
    }

    public boolean deleteFileIfNotAbsolutePath(Path path) throws IOException {
        if (! path.isAbsolute()) {
            Files.delete(path);
            return true;
        }
        return false;
    }

    // challenge
    public Optional<String> absolutePathOfLargestLabSolutionFile() throws IOException {
        Path path = Paths.get("lab-solutions");
        return Files.walk(path)
                .filter(p -> p.toString().endsWith("LabSolution.java"))
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .map(Path::toAbsolutePath)
                .map(Path::toString)
                .findAny();
    }
}
