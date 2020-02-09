package com.jeanneboyarsky.definition;

public class Antipattern {

    public void doEverything() {
        try {
           doWork();
        } catch(Exception e) {
            // ignore
        }
    }


    private void doWork() {

    }
}
