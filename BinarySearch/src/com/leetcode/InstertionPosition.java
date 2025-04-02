package com.leetcode;

public class InstertionPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int t = 5;
        System.out.println(searchInsert(arr, t));
    }
    static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length -1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        if(nums[s] > target){
            return s;
        }else {
            return s + 1;
        }
    }
}
