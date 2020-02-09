package com.jeanneboyarsky.strings;

public class Multiples {

    public String tenStarsBad() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0;  i < 10; i++) {
            builder.append("*");
        }
        return builder.toString();
    }

    public String tenStars() {
        return "*".repeat(10);
    }
}
