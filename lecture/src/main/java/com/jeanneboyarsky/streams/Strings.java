package com.jeanneboyarsky.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Strings {

    public long countLinesWithQuestion(String text) {
       return text.lines()
               .filter(s -> s.contains("?"))
               .count();
    }

    public long countQuestionMarks(String text) {
        return text.chars()
                .filter(c -> c == '?')
                .count();
    }
}
