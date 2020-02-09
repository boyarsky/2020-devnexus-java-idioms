package com.jeanneboyarsky.strings;

public class Formatting {

   public void printPi() {
       double pi = 3.14159265359;
       System.out.format("%s is %3.2f to the nearest %d digits",
               "Pi", pi, 2);
   }
}
