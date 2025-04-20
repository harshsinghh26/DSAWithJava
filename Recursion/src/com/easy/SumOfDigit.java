package com.easy;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(45632));
    }
    static int sumOfDigit(int n){
        int sum = 0;
        if (n == 0){
            return sum;
        }
        int rem = n % 10;
        sum = rem + sumOfDigit(n/10);
        return sum;
    }
}
