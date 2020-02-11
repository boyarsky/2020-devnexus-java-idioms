package com.jeanneboyarsky.collections;

import java.util.Map;

public class MapsJava8 {

   public void addIfMissing(Map<Integer, String> map,
        int key, String value) {

        map.putIfAbsent(key, value);
   }

}
