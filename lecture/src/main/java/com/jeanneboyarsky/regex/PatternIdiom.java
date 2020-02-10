package com.jeanneboyarsky.regex;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternIdiom {
    
    public static Set<String> getTags(String text) {
        Set<String> tags = new TreeSet<>();
        String openTag = "<";
        String closeTag = ">";
        String tagContents = "[^/>]+";
        String regex = openTag + "(" + tagContents + ")" + closeTag;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String tagName = matcher.group(1);
            tags.add(tagName);
        }
        return tags;
    }

    public static String sanitize(String text) {
        String number = "[0-9]{1,3}";
        String dot = "\\.";
        String regex = number + dot + number + dot + number + dot + number;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            String ip = matcher.group();
            matcher.appendReplacement(builder, "xxx");
        }
        matcher.appendTail(builder);
        return builder.toString();
    }
}
