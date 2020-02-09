package com.jeanneboyarsky.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsMatchTest {

    private IsMatch target;

    @BeforeEach
    void setUp() {
        target = new IsMatch();
    }

    @Test
    public void validatePalmTreeBad() {
        target.validatePalmTreeBad("palm");
        target.validatePalmTreeBad("palm tree");
        assertThrows(IllegalArgumentException.class, () -> target.validatePalmTreeBad("oak tree"));
    }

    @Test
    public void validatePalmTree() {
        target.validatePalmTree("palm");
        target.validatePalmTree("palm tree");
        assertThrows(IllegalArgumentException.class, () -> target.validatePalmTree("oak tree"));
    }
}