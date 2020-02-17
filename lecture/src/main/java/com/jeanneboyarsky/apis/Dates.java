package com.jeanneboyarsky.apis;

import java.time.LocalDate;
import java.time.Month;

public class Dates {

    public LocalDate now() {
        return LocalDate.now();
    }

    public LocalDate presidentsDay() {
        return LocalDate.of(2020, Month.FEBRUARY, 17);
    }

    public LocalDate dateMath(LocalDate date) {
        return date.plusDays(4).minusWeeks(1);
    }
}
