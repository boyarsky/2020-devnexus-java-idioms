package com.jeanneboyarsky.strings;

public class IsMatch {

    public void validatePalmTreeBad(String tree) {
        if (tree.indexOf("palm") < 0 ) {
            throw new IllegalArgumentException("Not a palm tree");
        }
    }

    public void validatePalmTree(String tree) {
        if (! tree.contains("palm")) {
            throw new IllegalArgumentException("Not a palm tree");
        }
    }

}
