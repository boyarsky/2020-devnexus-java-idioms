package com.jeanneboyarsky.regex;

public class ReplaceAllCaseInsensitive {

    public static String replaceShort(String text) {
        return text.replaceAll("[xX]{3}", "");
    }
    
    public static String replaceLong(String text) {
        return text.replaceAll("(?i)www\\.google\\.com", "");
    }

}
