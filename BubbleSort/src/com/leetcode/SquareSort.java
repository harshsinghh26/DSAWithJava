package com.leetcode;

import java.util.Arrays;

public class SquareSort {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums) {
        for (int i = 0; i< nums.length; i++){
            int a = square(nums[i]);
            nums[i] = a;
        }
        Arrays.sort(nums);
        return nums;
    }

    static int square(int n){
        return n * n;
    }
}
