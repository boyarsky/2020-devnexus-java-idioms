package com.jeanneboyarsky.collections;

import java.util.List;

public class Removing {

    static class Name {
        Name(String name) {
            firstName = name;
        }
        String firstName;
        public String getFirstName() {
            return firstName;
        }
    }

    public void remove(List<String>list, String target) {
         list.remove(target);
    }

    public void removeWithoutEquals(List<Name>list, String target) {
        list.removeIf(n -> target.equals(n.getFirstName()));
    }


}
