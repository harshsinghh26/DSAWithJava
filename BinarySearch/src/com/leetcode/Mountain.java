package com.leetcode;

public class Mountain {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        System.out.println(peakIndexInMountainArray(nums));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(arr[mid] > arr[mid + 1]){
                e = mid;
            }else {
                s = mid + 1;
            }
        }
        return s;
    }
}
