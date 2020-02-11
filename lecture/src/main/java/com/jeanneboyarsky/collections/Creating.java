package com.jeanneboyarsky.collections;

import java.util.*;

public class Creating {

    public List<Integer> createList() {
        return Arrays.asList(1, 2, 3);
    }

    public List<Integer> createMutableList() {
        return new ArrayList<>(Arrays.asList(1, 2, 3));
    }

    public Set<Integer> createSet() {
        return new HashSet<>(Arrays.asList(1, 2, 3));
    }

    public Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        return map;
    }

}
