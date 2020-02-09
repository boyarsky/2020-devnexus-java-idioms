package com.jeanneboyarsky.strings;

public class OnlyWhitespace {
    
    public void validateOnlyWhitespaceBad(String string) {
        if (string.trim().length() == 0) {
            throw new IllegalArgumentException("Not blank");
        }
    }

    public void validateOnlyWhitespaceBetter(String string) {
        if (string.trim().isEmpty()) {
            throw new IllegalArgumentException("Not blank");
        }
    }

    public void validateOnlyWhitespaceBitBetter(String string) {
        if (string.strip().isEmpty()) {
            throw new IllegalArgumentException("Not blank");
        }
    }

    public void validateOnlyWhitespaceBest(String string) {
        if (string.isBlank()) {
            throw new IllegalArgumentException("Not blank");
        }
    }
}
