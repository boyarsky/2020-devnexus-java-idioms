package com.jeanneboyarsky.regex;

public class Multiline {
    
    public static String remove(String text) {
        return text.replaceAll("(?m)^\\s(.*)$",
                "$1");
    }
}
