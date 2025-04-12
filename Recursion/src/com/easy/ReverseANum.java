package com.easy;

public class ReverseANum {
    public static void main(String[] args) {
        reverse(87654321);
        System.out.println(sum);

    }
//    static void reverse(int n){
//        if (n == 0){
//            return;
//        }
//        int rem = n % 10;
//        System.out.print(rem);
//        reverse(n/10);
//    }
    static int sum = 0;
    static void  reverse(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum *10 + rem;
        reverse(n/10);
    }
}
