package com.jeanneboyarsky.regex;

public class RemoveTrailing {

    public static String removeTrailingPeriod(String text) {
        return text.replaceFirst("\\.$", "");
    }

}
