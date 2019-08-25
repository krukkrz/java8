package com.company.solutions;

public class Solution14 {
    public String solution(String s1, String s2) {
        String result = "";
        for(int length = s1.length(); length>0; length--){
            int startIndex = 0;
            while (startIndex + length <= s1.length()){
                String current = s1.substring(startIndex, startIndex+length);
                System.out.println("current: "+current);
                if (s2.contains(current)){
                    result = current;
                    System.out.println(result);
                    break;
                }
                startIndex++;
            }
            if (result.length() != 0){
                break;
            }
        }


        return result;
    }
}
