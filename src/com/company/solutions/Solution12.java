package com.company.solutions;

import java.lang.reflect.Array;
import java.util.*;

public class Solution12 {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i =0; i<A.length; i++){
            set.add(A[i]);
        }
        int max = Collections.max(set);
        int solution = 1;

        if(max > 0){
            for(int i = 1; i<=max+1; i++){
                if (!set.contains(i)){
                    solution = i;
                    break;
                }
            }
        }

        return solution;
    }



}
