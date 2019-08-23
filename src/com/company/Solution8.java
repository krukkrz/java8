package com.company;

public class Solution8 {
    public boolean solution(int big, int small, int goal) {

        Boolean is = false;

        if(goal > (big*5 + small)){
            is=false;
        }else{
            for(int i = big; i>0; i --){
                if(goal % i*5 == 0){
                    goal = goal - i*5;
                    break;
                }
            }

            for(int s = small; s>0; s--){
                if(goal>0 && goal % s == 0){
                    goal = goal - s;
                }
            }

            if (goal == 0){
                is = true;
            }
        }


        return is;

    }
}
