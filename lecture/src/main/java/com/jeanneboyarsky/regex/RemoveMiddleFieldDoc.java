package com.jeanneboyarsky.regex;

public class RemoveMiddleFieldDoc {

    public static String removeMiddle(String csv) {
        String anyCharsExceptComma = "[^,]*";
        String captureCharsWithoutComma = '(' + anyCharsExceptComma + ')';
        char comma = ',';
        String regex = captureCharsWithoutComma + comma
                + anyCharsExceptComma + comma + captureCharsWithoutComma;
        return csv.replaceFirst(regex, "$1,$2");
    }
}
