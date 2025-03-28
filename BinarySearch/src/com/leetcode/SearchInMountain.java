package com.leetcode;

public class SearchInMountain {
    public static void main(String[] args) {

    }

    static int findInMountain(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr, target, peak + 1, arr.length -1);
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

    static int binarySearch(int[] arr, int target, int s, int e){
        boolean isAsc = arr[s] < arr[e];

        while (s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] < target){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }else {
                if(arr[mid] > target){
                    s = mid + 1;
                }else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

}
