package com.easy;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(28));
    }
    static boolean isPowerOfTwo(int n) {
        if (n == 1){
            return true;
        }
        if (n % 2 == 0){
            return isPowerOfTwo(n/2);
        }else {
            return false;
        }
    }
}
