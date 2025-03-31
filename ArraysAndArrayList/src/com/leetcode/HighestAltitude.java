package com.leetcode;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int newAlt = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++){
            newAlt += gain[i];
            if(newAlt > max){
                max = newAlt;
            }
        }
        return max;
    }
}
