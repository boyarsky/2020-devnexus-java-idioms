package com.jeanneboyarsky.regex;

public class Regex {
    
    private String removeLeadingNumbers(String text) {
        return text.replaceFirst("^[0-9]+", "");
    }

    private String removeTrailingPeriod(String text) {
        return text.replaceFirst("\\.$", "");
    }

    public static void main(String... args ){
        Regex regex = new Regex();
        System.out.println(regex.removeLeadingNumbers("123 abc"));
        System.out.println(regex.removeLeadingNumbers("x abc"));
        System.out.println(regex.removeTrailingPeriod("123 abc."));
        System.out.println(regex.removeTrailingPeriod("x abc."));
    }
}
