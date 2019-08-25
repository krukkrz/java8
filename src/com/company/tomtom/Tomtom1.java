package com.company.tomtom;

import java.util.ArrayList;
import java.util.List;

public class Tomtom1 {
    public String solution(String S) {


        List<String> list = new ArrayList<>();
        String current = "";


        for (int i = 0; i < S.length(); i ++){
            StringBuilder s = new StringBuilder(S);
            current = s.deleteCharAt(i).toString();
            list.add(current);
        }


        list.sort(String::compareToIgnoreCase);

        return list.get(0);
    }
}
