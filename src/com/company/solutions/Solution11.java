package com.company.solutions;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.sql.Array;

public class Solution11 {
    public String solution(String code) {
        int N = 5;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] codeChars = code.toCharArray();
        for(int i = 0; i<codeChars.length; i++){
            for (int a = 0; a<alphabet.length; a++){
                if (codeChars[i]==alphabet[a]){
                    codeChars[i] = alphabet[a];
                }
            }
        }

        return codeChars.toString();
    }
}
