package com.jeanneboyarsky.advancedstreams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapsTest {

    private Maps target;

    @BeforeEach
    void setUp() {
        target = new Maps();
    }

    @Test
    void mapByName() {
        List<String> list = List.of("a");
        Map<String,Integer> expected = Map.of("a", 1);
        Map<String,Integer> actual = target.mapByName(list);
        assertEquals(expected, actual);
    }

    @Test
    void mapBySize() {
        List<String> list = List.of("a");
        Map<Integer,String> expected = Map.of(1, "a");
        Map<Integer,String> actual = target.mapBySize(list);
        assertEquals(expected, actual);
    }

    @Test
    void mapBySizeWIihDuplicates() {
        List<String> list = List.of("a", "b");
        Map<Integer,String> expected = Map.of(1, "a");
        Map<Integer,String> actual = target.mapBySize(list);
        assertEquals(expected, actual);
    }

    @Test
    void grouping() {
        List<String> list = List.of("a");
        Map<Integer,List<String>> expected = Map.of(1, List.of("a"));
        Map<Integer,List<String>> actual = target.grouping(list);
        assertEquals(expected, actual);
    }

    @Test
    void partitioning() {
        List<String> list = List.of("a");
        Map<Boolean,List<String>> expected = Map.of(false, List.of("a"), true, List.of());
        Map<Boolean,List<String>> actual = target.partitioning(list);
        assertEquals(expected, actual);
    }

    @Test
    void groupingWithCount() {
        List<String> list = List.of("a");
        Map<Integer, Long> expected = Map.of(1, 1L);
        Map<Integer, Long> actual = target.groupingWithCount(list);
        assertEquals(expected, actual);
    }
}