package com.jeanneboyarsky.collections;

import java.util.Map;

public class Maps {

   public void addIfMissing(Map<Integer, String> map,
        int key, String value) {

        if (! map.containsKey(key)) {
            map.put(key, value);
        }
   }

}
