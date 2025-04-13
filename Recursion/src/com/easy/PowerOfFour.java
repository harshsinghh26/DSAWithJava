package com.easy;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(-1));
    }
    static boolean isPowerOfFour(int n) {
        if (n == 1){
            return true;
        }
        if (n > 0 && n % 4 == 0){
            return isPowerOfFour(n/4);
        }else {
            return false;
        }
    }
}
