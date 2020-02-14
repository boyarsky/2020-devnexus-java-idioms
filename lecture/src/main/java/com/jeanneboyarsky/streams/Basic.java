package com.jeanneboyarsky.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Basic {

    public List<Integer> method(List<String> list) {

        return list.stream()
                .map(String::trim)
                .filter(s -> ! s.isEmpty())
                .map(String::length)
                .collect(Collectors.toList());

    }
}
