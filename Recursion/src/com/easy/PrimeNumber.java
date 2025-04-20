package com.easy;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 15;
        isPrime(n, 2);
    }
    static void isPrime(int n, int d){
        if (d == n || n == 1){
            System.out.println("Yes");
            return;
        }
        if (d < n && n % d == 0){
            System.out.println("No");
        }else {
            isPrime(n , d+1);
        }
    }
}
