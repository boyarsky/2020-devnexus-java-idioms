package com.jeanneboyarsky.streams;

import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class Max {

   public OptionalInt max(List<Integer> list) {
       if (list.isEmpty()) {
           return OptionalInt.empty();
       }
       Collections.sort(list);
       int max = list.get(list.size() - 1);
       return OptionalInt.of(max);
   }

    public OptionalInt maxStream(List<Integer> list) {
        return list.stream().mapToInt(x -> x).max();
    }
}
