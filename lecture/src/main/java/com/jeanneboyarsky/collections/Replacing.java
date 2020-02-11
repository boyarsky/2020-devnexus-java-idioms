package com.jeanneboyarsky.collections;

import java.util.List;

public class Replacing {

    public void doubleString(List<String> list) {
        list.replaceAll(s -> s + s);
    }


}
