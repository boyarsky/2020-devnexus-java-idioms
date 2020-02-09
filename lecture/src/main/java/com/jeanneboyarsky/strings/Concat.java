package com.jeanneboyarsky.strings;

public class Concat {

    public String builder() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0;  i < 10; i++) {
            builder.append(i);
            builder.append(" ");
        }
        return builder.toString();
    }

    public String concat() {
        String result = "";
        for (int i = 0;  i < 10; i++) {
           result += i + " ";
        }
        return result;
    }
}
