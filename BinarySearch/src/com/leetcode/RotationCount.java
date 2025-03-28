package com.leetcode;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int[] nums) {
        int pivot = findPivot(nums);
        return pivot + 1;
    }
    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;
            if(mid < e && arr[mid] > arr[mid + 1]){
                return mid;
            }if(mid > s && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }if(arr[mid] < arr[s]){
                e = mid -1;
            }else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
