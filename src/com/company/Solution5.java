package com.company;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Solution5 {
    public Double solution(List<Integer> list) {
        OptionalDouble result = list.stream().mapToDouble(a -> a).average();

        return result.orElse(0);
    }
}
