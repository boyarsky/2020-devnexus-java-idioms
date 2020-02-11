package com.jeanneboyarsky.collections;

import java.util.List;

public class ListContains {

    static class Name {
        String firstName;
        Name(String name) {
            firstName = name;
        }
        public String getFirstName() {
            return firstName;
        }
    }

    public boolean findMatch(List<String>list, String target) {
        return list.contains(target);
    }

    public boolean findMatchWithoutEquals(List<Name>list, String target) {
        return list.stream()
                .anyMatch(n -> target.equals(n.getFirstName()));
    }


}
