package com.company.solutions;

public class Solution6 {
    public Integer solution(int n) {
        int n1 = 0;
        int n2 = 1;
        int fib = 0;
        int sum = 0;

        while(fib <= n){
            if(fib % 2 == 0){
                sum+=fib;
            }
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
            System.out.println("n: "+n);
            System.out.println("n1: "+n1);
            System.out.println("n2: "+n2);
            System.out.println("fib: "+fib);
        }

        return sum;
    }
}
