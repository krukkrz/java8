package com.company.solutions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Tomtom {
    public int solution(int[] A) {
        int result =1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<A.length; i++){
            set.add(A[i]);
        }

        int max = Collections.max(set);

        for (int i = 1; i<=max+1; i++){
            if(!set.contains(i)){
                result = i;
                break;
            }
        }

        return result;
    }
}
