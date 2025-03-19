package com.video;

public class CountingOccurance {
    public static void main(String[] args) {
        int n = 1385151819;
        int count = 0;

        while (n > 0){
            int rem = n%10 ;
            if (rem == 1){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
