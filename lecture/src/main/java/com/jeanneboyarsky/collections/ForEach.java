package com.jeanneboyarsky.collections;

import java.util.*;

public class ForEach {

    public void printTwice(Set<Character> set) {
        set.forEach(c -> System.out.println(c));
        set.forEach(System.out::println);
    }

    public void print(Map<Character, Double> map) {
        map.entrySet().forEach(System.out::println);
        map.forEach((k,v) -> System.out.println(k + v));
    }
}
