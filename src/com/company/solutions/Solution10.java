package com.company.solutions;

import java.util.Arrays;
import java.util.List;

public class Solution10 {
    public String solution(List<Integer> list) {
        String strings = "";
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) %2==0){
                strings+="e"+list.get(i);
            }else{
                strings+="o"+list.get(i);
            }
            if(i!=list.size()-1){
                strings+=",";
            }
        }

        return strings;
    }
}
