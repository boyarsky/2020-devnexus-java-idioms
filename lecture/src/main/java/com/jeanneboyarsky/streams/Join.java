package com.jeanneboyarsky.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Join {

   public String join(List<Integer> list) {
       String result = "";
       for(Integer num: list) {
           if (! result.isEmpty()) {
               result+= " ";
           }
           result += num;
       }
       return result;
   }

    public String joinStream(List<Integer> list) {
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" " ));
    }
}
