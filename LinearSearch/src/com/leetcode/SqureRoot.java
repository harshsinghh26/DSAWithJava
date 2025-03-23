package com.leetcode;

public class SqureRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }
    static int sqrt(int x){
       int n = x;
       int ans = 0;
       for (int i = 1; i<=x; i++){
           ans = n/i;
           if (ans == i){
               return ans;
           }
       }
       return 0;
    }
}
