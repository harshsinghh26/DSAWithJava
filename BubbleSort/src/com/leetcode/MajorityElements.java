package com.leetcode;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        int count = 1;
        boolean swapped;
        for (int i = 0; i < nums.length; i++){
            swapped = false;
            for (int j = 1; j < nums.length - i; j++){
                if (nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j -1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
           if (i + 1 < nums.length && nums[i]  == nums[i + 1]){
               count++;
               if (count > nums.length /2) {
                   return nums[i];
               }
           }else {
               count = 1;
           }
        }
        return nums[0];
    }
}
