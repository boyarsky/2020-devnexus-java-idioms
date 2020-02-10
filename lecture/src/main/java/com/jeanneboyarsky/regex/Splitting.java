package com.jeanneboyarsky.regex;

public class Splitting {
    
   public static String[] nameParts(String text) {
       return text.split("[ ,]+");
   }
}
