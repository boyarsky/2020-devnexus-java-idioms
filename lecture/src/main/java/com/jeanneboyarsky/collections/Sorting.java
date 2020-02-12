package com.jeanneboyarsky.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public void sortAlphabetically(List<String> list) {
        Collections.sort(list);
        list.sort(Comparator.naturalOrder());
    }

    public void sortBackwards(List<String> list) {
        Collections.sort(list);
        list.sort(Comparator.reverseOrder());
    }

    public void sortByLength(List<String> list) {
        list.sort(Comparator.comparing(String::length));
    }

    public void sortByLengthReversed(List<String> list) {
        list.sort(Comparator.comparing(String::length).reversed());
    }
}
