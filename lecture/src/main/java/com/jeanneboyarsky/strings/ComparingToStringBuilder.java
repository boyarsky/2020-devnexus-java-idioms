package com.jeanneboyarsky.strings;

public class ComparingToStringBuilder {

    public boolean usingEquals(String str, StringBuilder sb) {
        return str.equals(sb.toString());
    }

    public boolean better(String str, StringBuilder sb) {
        return str.contentEquals(sb);
    }
}
