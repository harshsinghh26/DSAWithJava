package com.easy;

public class CountZeros {
    public static void main(String[] args) {
//        countZero(3021409);
//        System.out.println(count);
        System.out.println(count(3021409));
    }
    static int count = 0;
    static void countZero(int n){
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        if (rem == 0){
            count++;
        }
        countZero(n / 10);
    }

    static int count(int n){
        return helper(n, 0);
    }

    static int helper(int n, int c){
        if (n == 0){
            return  c;
        }
        int rem = n % 10;
        if (rem == 0){
            return helper(n /10, c+1);
        }
        return helper(n / 10, c);
    }
}
