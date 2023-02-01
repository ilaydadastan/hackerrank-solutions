package com.example.hackerrank.abstraction;

public class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
        int total=0;
        for (int i = 1; i <=n/2; i++) {
            if (n%i==0){
                total=total+i;
            }
        }
        return total+n;
    }
}
