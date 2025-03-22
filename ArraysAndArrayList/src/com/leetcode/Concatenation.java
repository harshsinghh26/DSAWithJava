package com.leetcode;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] arr = {1,3,4};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
