package com.company.tomtom;

import java.util.ArrayList;
import java.util.List;

public class Tomtom2 {
    public int[] solution(int N) {

        List<Integer> ints = new ArrayList<>();

        if(N%2==0){
            int start = N/2*(-1);
            int end = N/2;
            for (int i = start; i<end; i++){
                if(i!=0){
                    ints.add(i);
                }
            }
        }else {

            int start = N/2*(-1);
            int end = N/2;
            for (int i = start; i<end; i++){
                    ints.add(i);
            }
        }

        return ints.stream().mapToInt(i->i).toArray();
    }
}
