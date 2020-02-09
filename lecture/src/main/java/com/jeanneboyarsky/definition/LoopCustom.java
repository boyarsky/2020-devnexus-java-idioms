package com.jeanneboyarsky.definition;

public class LoopCustom {


    public int countPositive(int[] nums) {
        int count = 0;
        int index = 0;
        while(nums.length > index) {
            if (nums[index] > 0) {
                count++;
            }
            index++;
        }
        return count;
    }

}
