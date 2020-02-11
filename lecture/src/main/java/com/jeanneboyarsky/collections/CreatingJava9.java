package com.jeanneboyarsky.collections;

import java.util.*;

public class CreatingJava9 {

    public List<Integer> createList() {
        return List.of(1, 2, 3);
    }

    public List<Integer> createMutableList() {
        return new ArrayList<>(List.of(1, 2, 3));
    }

   public Set<Integer> createSet() {
       return Set.of(1, 2, 3);
   }

    public Map<String, Integer> createMap() {
        return Map.of("a", 1,
                "b", 2);
    }

    public Map<String, Integer> createMapClearer() {
        return Map.ofEntries(
                Map.entry("a", 1),
                Map.entry("b", 2));
    }
}
