package com.jeanneboyarsky.regex;

public class RemoveMiddleFieldRegex {

    public static String removeMiddle(String csv) {
       return csv.replaceFirst("([^,]*),[^,]*,([^,]*)",
               "$1,$2");
    }
}
