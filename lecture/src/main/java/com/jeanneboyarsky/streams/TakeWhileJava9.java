package com.jeanneboyarsky.streams;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileJava9 {

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
        return builds.stream()
                .takeWhile(b -> ! b.isPassed())
                .map(Build::getNum)
                .collect(Collectors.toList());
    }
}
