package com.leetcode;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;
            if(mid < e && arr[mid] > arr[mid + 1]){
                return arr[mid + 1];
            }if(mid > s && arr[mid] < arr[mid - 1]){
                return arr[mid];
            }if(arr[mid] < arr[s]){
                e = mid -1;
            }else {
                s = mid + 1;
            }
        }
        return arr[0];
    }
}
