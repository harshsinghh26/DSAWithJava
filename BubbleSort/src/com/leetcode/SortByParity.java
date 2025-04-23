package com.leetcode;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = 0;

        while(i < nums.length){
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else {
                i++;
            }
        }
        return nums;
    }
}
