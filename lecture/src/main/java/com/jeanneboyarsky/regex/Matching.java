package com.jeanneboyarsky.regex;

public class Matching {
    
    public static boolean isOnlyDigits(String text) {
       return text.matches("\\d+");
    }

    public static boolean atLeastOneDigit(String text) {
       return text.matches(".*\\d.*");
    }
}
