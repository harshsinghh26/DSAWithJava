package com.easy;

public class SumOfnNaturalNum {
    public static void main(String[] args) {
        System.out.println(sumOfN(6));
    }
    static int sumOfN(int n){
        int sum = 0;
        if (n == 0){
            return sum;
        }
        sum = n + sumOfN(n-1);
        return sum;
    }
}
