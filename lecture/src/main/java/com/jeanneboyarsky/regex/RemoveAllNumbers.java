package com.jeanneboyarsky.regex;

public class RemoveAllNumbers {
    
    public static String removeAll(String text) {
        return text.replaceAll("[0-9]", "");
    }

}
