package com.easy;

public class IsPalindrom {
    public static void main(String[] args) {
        int n = 12321;
        reverse(n);
        System.out.println(isPalindrom(sum, n));
    }
    static int sum = 0;
    static void reverse(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    static boolean isPalindrom(int n, int sum){
        return n == sum;
    }
}
