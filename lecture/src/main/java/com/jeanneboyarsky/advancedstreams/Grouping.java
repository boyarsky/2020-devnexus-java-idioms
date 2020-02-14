package com.jeanneboyarsky.advancedstreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    public void method(List<String> list) {

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        this::calculate));
    }

    private Integer calculate(String s) {
        return 0;
    }


}
