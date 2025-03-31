package com.leetcode;

import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] i = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(arr, i)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] newarr = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            newarr[index[i]] = nums[i];
        }
        return newarr;
    }
}
