package com.leetcode;

import java.util.ArrayList;

public class GreatestNumOfCandies {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int ext = 3;
        System.out.println(kidsWithCandies(arr, ext));
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int sum = 0;
        boolean ans = true;
        int max = candies[0];
        for(int i = 1; i < candies.length; i++){
            if (max < candies[i]){
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++){
            sum = candies[i] + extraCandies;
            if(sum >= max){
                ans = true;
            }else {
                ans = false;
            }
            list.add(ans);
        }
        return list;
    }
}
