package com.company;

import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public int solution(Integer i, Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        int index = list.indexOf(i);
        return index;
    }
}
