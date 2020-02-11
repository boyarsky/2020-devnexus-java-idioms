package com.jeanneboyarsky.collections;

import java.util.Map;

public class GetOrDefault {

   public int total(Map<String, Integer> map,
                   String key1, String key2) {

      return map.getOrDefault(key1, 0)
              + map.getOrDefault(key2, 0);
   }

}
