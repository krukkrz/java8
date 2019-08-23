package com.company;

import java.util.List;

public class Solution3 {
    public String solution(String string) {
        String result = "";
        for(int i = string.length()-1; i>=0; i--){
            System.out.println(i);
            result += string.charAt(i);
        }

        return result;
    }
}
