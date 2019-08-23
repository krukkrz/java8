package com.company;

public class Solution7 {
    public Integer solution(int p, int q) {
        Integer gcd = 1;

        if(p > q){
            for(int i = q; i>0; i--){
                if(p % i == 0 && q % i == 0){
                    gcd = i;
                    break;
                }
            }
        }else{
            for(int i = p; i>0; i--){
                if(p % i == 0 && q % i ==0){
                    gcd = i;
                    break;
                }
            }
        }

        return gcd;
    }
}
