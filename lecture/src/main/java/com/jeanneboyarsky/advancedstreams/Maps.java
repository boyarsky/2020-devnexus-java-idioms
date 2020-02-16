package com.jeanneboyarsky.advancedstreams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    public Map<String,Integer> mapByName(List<String> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        String::length));
    }

    public Map<Integer,String> mapBySize(List<String> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        String::length,
                        s -> s,
                        (a, b) -> a));
    }


    public Map<Integer,List<String>> grouping(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public Map<Boolean,List<String>> partitioning(List<String> list) {
        return list.stream()
                .collect(Collectors.partitioningBy(String::isEmpty));
    }

    public Map<Integer,Long> groupingWithCount(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
    }
}
