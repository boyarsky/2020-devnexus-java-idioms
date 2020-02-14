package com.jeanneboyarsky.streams;

import java.util.List;
import java.util.Optional;

public class DropWhileJava9 {

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
        return builds.stream()
                .dropWhile(b -> ! b.isPassed())
                .map(Build::getNum)
                .findFirst();
    }
}
