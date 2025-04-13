package com.easy;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-1));
    }
    static boolean isPowerOfThree(int n) {
        if (n == 1){
            return true;
        }
        if (n > 0 && n % 3 == 0){
            return isPowerOfThree(n/3);
        }else {
            return false;
        }
    }
}
