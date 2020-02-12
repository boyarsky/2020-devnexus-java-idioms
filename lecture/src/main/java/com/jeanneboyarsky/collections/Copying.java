package com.jeanneboyarsky.collections;

import java.util.*;

public class Copying {

    public <T> List<T> constructor(List<T> original) {
        return new ArrayList<>(original);
    }

    public <T> List<T> copyOf(List<T> original) {
        return List.copyOf(original);
    }

    public <T> List<T> synchronizedList(List<T> original) {
        return Collections.synchronizedList(original);
    }

    public <T> List<T> unmodifiableList(List<T> original) {
        return Collections.unmodifiableList(original);
    }
}
