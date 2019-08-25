package com.company.solutions;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] A){
        AtomicInteger solution = new AtomicInteger(1);

        Set<Integer> set = new HashSet<>();

        for (int i=0; i<A.length; i++){
            set.add(A[i]);
        }

        for (int a=1; a<=Collections.max(set)+1; a++){
            if (!set.contains(a)){
                solution.set(a);
                break;
            }
        }

        return solution.get();
    }
}
