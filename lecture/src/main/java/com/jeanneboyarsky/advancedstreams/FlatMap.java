package com.jeanneboyarsky.advancedstreams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public List<String> method() {
        List<String> first = List.of("a", "b");
        List<String> second = List.of();
        List<List<String>> listOfLists = List.of(first, second);

        return listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }


}
