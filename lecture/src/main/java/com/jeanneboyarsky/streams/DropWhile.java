package com.jeanneboyarsky.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DropWhile {

    static class Build {
        private boolean passed;
        private int num;
        private boolean isPassed() {
            return passed;
        }
        private int getNum() {
            return num;}
        Build(boolean passed, int num) {
            this.passed = passed;
            this.num = num;
        }
    }

    public Optional<Integer> getMostRecentSuccess(List<Build> builds) {
        List<Integer> result = new ArrayList<>();
        for (Build b: builds) {
            if (b.isPassed()) {
                return Optional.of(b.getNum());
            }
        }
        return Optional.empty();
    }
}
