package com.leetcode;

import java.util.Arrays;

public class Permutiation  {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,0};
        System.out.println(Arrays.toString(buildArray(arr)));

    }
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i< nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
