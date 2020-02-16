package com.jeanneboyarsky.advancedstreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generate {

    public String tenStars() {
        return Stream.generate(() -> "*")
                .limit(10)
                .collect(Collectors.joining());
    }

    public String counting() {
        return Stream.iterate(1, i-> i+1)
                .limit(10)
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }

    public String countingWithLimit() {
        return Stream.iterate(1, i -> i <= 10, i-> i+1)
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }


}
