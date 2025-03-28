package com.leetcode;

public class SearchInRotatedArrayII {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int t = 0;
        System.out.println(search(arr,t));
    }
    static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if(target == nums[pivot]){
            return true;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length-1);
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
            }if (arr[mid] == arr[s] && arr[mid] == arr[e]){
                if(s < e && arr[s] > arr[s + 1]){
                    return s;
                }
                s++;
                if(e > s && arr[e] < arr[e - 1]){
                    return e -1;
                }
                e--;
            }else if(arr[s] < arr[mid] || (arr[s] == arr[mid] && arr[mid] > arr [e])){
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return -1;
    }

    static boolean binarySearch(int[] arr, int target, int s, int e){
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] < target){
                s = mid + 1;
            }else if(arr[mid] > target){
                e = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
