package com.leetcode;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString((runningSum(arr))));
    }
    static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] runningSum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i == 0){
                runningSum[i] = nums[i];
            }else{
                for(int j = 0; j<=i; j++){
                    sum += nums[j];
                }
                runningSum[i] = sum;
                sum = 0;
            }
        }
        return runningSum;
    }
}
