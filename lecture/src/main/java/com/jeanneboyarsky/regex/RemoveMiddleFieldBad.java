package com.jeanneboyarsky.regex;

public class RemoveMiddleFieldBad {
    
    public static void main(String... args) {
        String csv = "first,middle,last";

        String result = removeMiddle(csv);

        System.out.println(result);
    }

    private static String removeMiddle(String csv) {
        int firstComma = csv.indexOf(',');
        int secondComma = csv.indexOf(',', firstComma + 1);
        String first = csv.substring(0, firstComma);
        String second = csv.substring(secondComma);
        return first + second;
    }
}
