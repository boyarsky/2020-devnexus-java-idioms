package com.jeanneboyarsky.collections;

import java.util.*;

public class AllMethods {

    public Set<Integer> union(Set<Integer> set, Collection<Integer> nums) {
        Set<Integer> copy = new HashSet<>(nums);
        copy.addAll(set);
        return copy;
    }

    public Set<Integer> intersection(Set<Integer> set, Collection<Integer> nums) {
        Set<Integer> copy = new HashSet<>(nums);
        copy.retainAll(set);
        return copy;
    }

    public Set<Integer> distinct(Set<Integer> set, Collection<Integer> nums) {
        Set<Integer> copy = new HashSet<>(set);
        copy.removeAll(nums);
        return copy;
    }

}
