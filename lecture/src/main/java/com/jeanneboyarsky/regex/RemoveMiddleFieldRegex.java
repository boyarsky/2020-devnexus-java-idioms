package com.jeanneboyarsky.regex;

public class RemoveMiddleFieldRegex {
    
    public static void main(String... args) {
        String csv = "first,middle,last";

        String result = removeMiddle(csv);

        System.out.println(result);
    }

    private static String removeMiddle(String csv) {
       return csv.replaceFirst("([^,]*),[^,]*,([^,]*)",
               "$1,$2");
    }
}
