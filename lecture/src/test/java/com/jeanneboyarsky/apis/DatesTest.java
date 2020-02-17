package com.jeanneboyarsky.apis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class DatesTest {

    private Dates target;

    @BeforeEach
    void setUp() {
        target = new Dates();
    }

    @Test
    void now_smokeTest() {
        target.now();
    }

    @Test
    void presidentsDay() {
        LocalDate actual = target.presidentsDay();
        assertEquals(2020, actual.getYear());
        assertEquals(Month.FEBRUARY, actual.getMonth());
        assertEquals(17, actual.getDayOfMonth());
    }

    @Test
    void dateMath() {
        LocalDate start = LocalDate.of(2020, Month.APRIL, 1);
        LocalDate actual = target.dateMath(start);
        assertEquals(2020, actual.getYear());
        assertEquals(Month.MARCH, actual.getMonth());
        assertEquals(29, actual.getDayOfMonth());
    }
}