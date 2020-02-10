package com.jeanneboyarsky.regex;

public class RemoveLeading {
    
    public static String removeLeadingNumbers(String text) {
        return text.replaceFirst("^[0-9]+", "");
    }

}
