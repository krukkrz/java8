package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Solution9 {
    public List<String> solution(List<String> list) {

        return list
                .stream()
                .filter(a->a.startsWith("a"))
                .filter(a->a.length()==3)
                .collect(Collectors.toList());
    }
}
