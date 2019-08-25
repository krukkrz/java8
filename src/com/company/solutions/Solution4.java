package com.company.solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution4 {
    public Integer solution(Integer[] list) {
        List<Integer> l = Arrays.asList(list);
        Integer max = Collections.max(l);
        return max;
    }
}
