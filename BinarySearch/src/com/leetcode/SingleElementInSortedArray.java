package com.leetcode;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr));

    }
    static int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int ans = 0;
        boolean isTrue = true;
        while(isTrue){
            int mid = s + (e - s) / 2;
            if(nums[mid] == nums[mid + 1]){
                if((mid + 1) % 2 == 0){
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }else if (nums[mid] == nums[mid - 1]){
                if((mid - 1) % 2 == 0){
                    s = mid + 1;
                }else {
                    e = mid - 1;
                }
            }else {
                ans = nums[mid];
                isTrue = false;
            }
        }
        return ans;
    }
}
