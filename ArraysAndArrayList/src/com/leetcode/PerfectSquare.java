package com.leetcode;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long start = 1;
        long end = num;
        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid*mid == num){
                return true;
            }else if(mid * mid > num){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return false;
    }
}
