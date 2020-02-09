package com.jeanneboyarsky.definition;

public class OnlyOne {

    private static OnlyOne instance;

    private OnlyOne(){}

    public static synchronized OnlyOne getInstance(){
        if(instance == null){
            instance = new OnlyOne();
        }
        return instance;
    }

}
