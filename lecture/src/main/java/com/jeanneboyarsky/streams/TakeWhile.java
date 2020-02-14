package com.jeanneboyarsky.streams;

import java.util.ArrayList;
import java.util.List;

public class TakeWhile {

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

    public List<Integer> getAllFailuresBeforeSuccess(List<Build> builds) {
        List<Integer> result = new ArrayList<>();
        for (Build b: builds) {
            if (! b.isPassed()) {
                result.add(b.getNum());
            } else {
                return result;
            }
        }
        return result;
    }
}
