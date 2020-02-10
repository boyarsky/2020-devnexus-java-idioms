package com.jeanneboyarsky.regex;

public class RemoveMiddleFieldBad {

    public static String removeMiddle(String csv) {
        int firstComma = csv.indexOf(',');
        int secondComma = csv.indexOf(',', firstComma + 1);
        String first = csv.substring(0, firstComma);
        String second = csv.substring(secondComma);
        return first + second;
    }
}
