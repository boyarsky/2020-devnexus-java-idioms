package com.jeanneboyarsky.strings;

public class IgnoringCase {

    public boolean equalsBad(String str1, String str2) {
        return str1.toLowerCase().equals(str2.toLowerCase());
    }

    public int compareBad(String str1, String str2) {
        return str1.toLowerCase().compareTo(str2.toLowerCase());
    }

    public boolean equalsBetter(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public int compareBetter(String str1, String str2) {
        return str1.compareToIgnoreCase(str2);
    }
}
