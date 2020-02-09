package com.jeanneboyarsky.strings;

import java.util.List;

public class PoorCsv {

    public String commaSeparatedBad(List<String> fields) {
        String result = "";
        for (String field: fields) {
            if (! result.isEmpty()) {
                result += ",";
            }
            result += field;
        }
        return result;
    }

    public String commaSeparated(List<String> fields) {
        return String.join(",",  fields);
    }
}
