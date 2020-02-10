package com.jeanneboyarsky.regex;

public class DotAll {
    
    public static String remove(String text) {
        return text.replaceAll("(?s)<form>.*</form>",
                "<form></form>");
    }
}
